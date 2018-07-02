package lesson1_9UserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Type in something.");
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("User input: " + scannerVariable.nextLine());
    }

}
