package practice6compare;

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
        return balls;
    }

    private static void generateHeavy(Ball[] balls) {
    }

    private static void compareBalls(Ball[] balls) {
    }


}
