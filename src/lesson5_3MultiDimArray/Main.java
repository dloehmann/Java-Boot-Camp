package lesson5_3MultiDimArray;

public class Main {

    private static String[][] twoDimensionalArray = {{"Premium0", "Premium1"}, {"Standard0", "Standard1",
            "Standard2"}, {"Basic0"}};

    public static void main(String[] args) {
        System.out.println(twoDimensionalArray[1][2]);

        for (String[] y : twoDimensionalArray) {
            for (String x : y) {
                System.out.println(x + " ");
            }
        }
    }
}
