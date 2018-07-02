package lesson2_4incrementOperator;

public class Main {

    public static void main(String[] args) {
        int oranges = 3;
        ++oranges;
        System.out.println(oranges); // prints 4
        System.out.println(++oranges); // prints 5
        System.out.println(oranges); // prints 5
        System.out.println(oranges++); // prints 5
        System.out.println(oranges); // prints 6
        oranges = oranges - 3;
        System.out.println(oranges); // prints 3 because 6-3 = 3
        oranges += 5; // we add 5 to the oranges
        System.out.println(oranges); // prints 8
    }
}
