package practice6compare;

import java.util.Random;

public class Main {


    public static final int BALL_COUNT = 9;
    public static final int SMALL_WEIGHT = 2;
    public static final int HEAVYWEIGHT = 3;

    public static void main(String[] args) {

        Ball[] balls = generateBalls();
        generateHeavy(balls);
        compareBalls(balls);
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

    private static void compareBalls(Ball[] balls) {
        for (int i = 1; i < balls.length; i++) {
            String rel;
            if (balls[i].compareTo(balls[i-1]) > 0) {
                rel = "heavier than";
            } else
            if (balls[i].compareTo(balls[i-1]) < 0) {
                rel = "lighter than";
            } else {
                rel = "equal to";
            }
            System.out.println("" + i + " is " + rel + " " + (i-1) );

            if (balls[i].getWeight() == HEAVYWEIGHT) {
                System.out.println("" + i + " is the heavy ball!");
            }
        }
    }


}
