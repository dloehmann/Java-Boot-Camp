package lesson1_9UserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerVariable = new Scanner(System.in);

        System.out.println("Type in int number.");
        // console input
        String input1 = scannerVariable.nextLine();
        double i1 = 0;
        i1 = Double.parseDouble(input1);
        
        System.out.println("User input: " + input1);

        System.out.println("Type in int number.");
        // console input
        String input2 = scannerVariable.nextLine();
        System.out.println("User input 2: " + input2);
        
        // Convert String to number
        double i2 = Double.parseDouble(input2);
        
        System.out.println(i1 + " + " +  i2 + " = " + (i1 + i2));
        
}

}
