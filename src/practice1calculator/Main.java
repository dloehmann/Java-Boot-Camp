package practice1calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("A simple calculator. Type in the first number");
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("User input: " + n1);

        System.out.println("Type in the second number");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("User input: " + n2);


    }
}
