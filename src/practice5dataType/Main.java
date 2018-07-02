package practice5dataType;

import java.util.Random;

public class Main {


    public static final int BALL_COUNT = 9;
    public static final int SMALL_WEIGHT = 2;
    public static final int HEAVYWEIGHT = 3;

    public static void main(String[] args) {

        Ball[] balls = generateBalls();
        generateHeavy(balls);
        findHeavyBall(balls);
    }

    private static Ball[] generateBalls() {
        Ball[] balls = new Ball[BALL_COUNT];
        for (int i = 0; i < BALL_COUNT; i++) {
            balls[i] = new Ball(SMALL_WEIGHT);
        }
        return balls;
    }

    private static void generateHeavy(Ball[] balls) {
        int selection = new Random().nextInt(BALL_COUNT);
        balls[selection].setWeight(HEAVYWEIGHT);
    }

    private static void findHeavyBall(Ball[] balls) {
        for (int i = 0; i < balls.length; i++) {
            System.out.println("" + i + " has weight " + balls[i].getWeight());

            if (balls[i].getWeight() == HEAVYWEIGHT) {
                System.out.println("" + i + " is the heavy ball!");
            }
        }
    }


}
