package lesson5_5RandomGenerator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random dice = new Random();
        int number;
        for (int i = 0; i < 6; i++) {
            number = 1 + dice.nextInt(49);
            System.out.println(number);
        }
    }
}
