package lesson1_7mathematicalOperators;

public class Main {

    public static void main(String[] args) {
        long a = 42;
        long b = 17;
        System.out.println(a + "+" + b + ": " + (a + b));
        System.out.println(a + "-" + b + ": " + (a - b));
        System.out.println(a + "*" + b + ": " + a * b);
        System.out.println(a + "/" + b + ": " + a / b);
        System.out.println(a + "/" + b + ": " + (double) a / b);
        System.out.println(a + " mod " + b + ": " + a % b);
        System.out.println(5 + " mod " + 3 + ": " + 5 % 3);
    }
}
