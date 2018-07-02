package lesson1_8Methods;

public class Main {

    public static double subtract(double a, double b) {
        printResult(a, b, a * b, '-');
        return a - b;
    }

    public static double divide(double a, double b) {
        double result = a / b;
        printResult(a, b, result, '/');
        return result;
    }

    public static double multiply(double a, double b) {
        printResult(a, b, a * b, '*');
        return a * b;
    }

    public static void printResult(double a, double b, double result, char opSign) {
        System.out.println(a + " " + opSign + " " + b + " = " + result);
    }

    public static double add(double a, double b) {
        printResult(a, b, a * b, '+');
        return a + b;
    }

    public static void main(String[] args) {
        add(3, 4);
        subtract(3, 4);
        multiply(3, 4);
        divide(3, 4);
    }
}
