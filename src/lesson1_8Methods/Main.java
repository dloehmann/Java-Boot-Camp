package lesson1_8Methods;

public class Main {

    public static double subtract(int a, int b) {
        System.out.println("Result: " + (a-b));
        printResult(a, b, a - b, '-');
        return a - b;
    }

    public static double divide(double a, double b) {
        double result = a / b;
        printResult(a, b, result, '/');
        return result;
    }

    public static double multiply(int a, int b) {
        printResult(a, b, a * b, '*');
        return a * b;
    }

    public static void printResult(int a, int b, int result, char operationSign) {
        System.out.println(a + " " + operationSign + " " + b + " = " + result);
    }

    public static void printResult(double a, double b, double result, char operationSign) {
        System.out.println(a + " " + operationSign + " " + b + " = " + result);
    }

    public static double add(int a, int b) {
        printResult(a, b, a + b, '+');
        return a + b;
    }

    public static void main(String[] args) {
        subtract(3, 4);
        multiply(3, 4);
        divide(3, 4);
        add(3, 4);
    }
}
