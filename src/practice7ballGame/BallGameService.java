package practice7ballGame;

/**
 * @Author Dennis Löhmann (Holisticon AG) 27.06.18
 **/
public class BallGameService {
    private static final int CIRCLECOUNT = 9;
    private static final int LIGHTWEIGHT = 2;
    private static final int HEAVYWEIGHT = 3;
    private static final int ROUNDS = 4;
    private static BallGameService instance = new BallGameService();
    private Ball[] balls;
    private int rounds = 0;

    public static BallGameService instance() {
        return instance;
    }

    private static void randomDefineHeavyBall(Ball[] balls) {
        int selection = (int) Math.floor(Math.random() * balls.length);
        balls[selection].setWeight(HEAVYWEIGHT);
        System.out.println("Selected: " + selection + " to be the heavy ball.");
    }

    public int getRounds() {
        return rounds;
    }

    public Ball[] generateBalls() {
        balls = new Ball[CIRCLECOUNT];
        for (int i = 0; i < CIRCLECOUNT; i++) {
            balls[i] = new Ball(LIGHTWEIGHT);
        }
        randomDefineHeavyBall(balls);
        for (Ball b : balls) {
            System.out.println("Ballweight: " + b.getWeight());
        }
        return balls;
    }

    public String getWeightText() {
        int c = compare();
        switch (c) {
            case -1:
                return "Green is heavier.";
            case 0:
                return "Both are equal.";
            case 1:
                return "Red is heavier.";
        }
        return "The selected balls weigh " + getSelectedWeight() + " kilo.";
    }

    public int getSelectedWeight() {
        int result = 0;
        for (Ball b : balls) {
            if (b.getSelectionType() == 1) {
                result += b.getWeight();
            }
        }
        return result;
    }

    public int getAltSelectedWeight() {
        int result = 0;
        for (Ball b : balls) {
            if (b.getSelectionType() == 2) {
                result += b.getWeight();
            }
        }
        return result;
    }

    public int compare() {
        Integer selectedWeight = getSelectedWeight();
        Integer altSelectedWeight = getAltSelectedWeight();
        return selectedWeight.compareTo(altSelectedWeight);
    }


    public String getResultText(int selected) {
        if (isResultCorrect(selected)) {
            return "Congrats! You Found it!";
        }
        return "GAME OVER!";
    }

    public boolean isResultCorrect(int selected) {
        return balls[selected].getWeight() == HEAVYWEIGHT;
    }

    public void increaseRounds() {
        if (rounds < ROUNDS) {
            rounds++;
        }
    }

    public void resetRounds() {
        rounds = 0;
    }

//    public boolean isFinalRound() {
//        return (rounds == ROUNDS);
//    }
//
//    public boolean isPreFinalRound() {
//        return (rounds+1 == ROUNDS);
//    }

    public String returnInstruction() {
        switch (BallGameService.instance().getRounds()) {
            case 1:
            case 2:
                return "Round " + rounds + ": Select Balls to get the weight";
            case 3:
                return "Click on the heaviest ball";
            case 4:
                return "Want another game?";
        }
        return "Something went wrong!";
    }

    public void resetBalls() {
        for (Ball b : balls) {
            b.setWeight(LIGHTWEIGHT);
            b.unselect();
        }
        randomDefineHeavyBall(balls);
    }

    public void resetSelections() {
        for (Ball b : balls) {
            b.unselect();
        }
    }

    public int countSelections() {
        int result = 0;
        for (Ball b : balls) {
            if (b.getSelectionType() > 0) {
                result += b.getWeight();
            }
        }
        return result;

    }

    public boolean existBothSelections() {
        boolean[] exists = new boolean[3];
        for (Ball b : balls) {
            exists[b.getSelectionType()] = true;
        }
        return exists[1] && exists[2];

    }
}
