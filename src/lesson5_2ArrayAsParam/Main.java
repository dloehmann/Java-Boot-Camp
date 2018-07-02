package lesson5_2ArrayAsParam;

public class Main {

    private static void printEm(String[] animals) {
        for (String a : animals) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        String[] bigFive = new String[]{"Lion", "Rhino", "Leopard", "Buffalo", "Elephant"};
        printEm(bigFive);
    }
}
