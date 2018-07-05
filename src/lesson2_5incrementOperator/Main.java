package lesson2_5incrementOperator;

public class Main {

    public static void main(String[] args) {
        int oranges = 3;
        // Execute ++ first, then use variable
        ++oranges; // o = o+1
        System.out.println(oranges); // prints 4
        // Execute ++ first, then print variable
        System.out.println(++oranges); // prints 5 
        System.out.println(oranges); // prints 5
        // Execute ++ last, after printing variable
        System.out.println(oranges++); // prints 5
        System.out.println(oranges); // prints 6
        oranges -= 3;// we remove 3 oranges
        System.out.println(oranges); // prints 3 because 6-3 = 3
        oranges += 5; // we add 5 to the oranges
        System.out.println(oranges); // prints 8
        }
}
