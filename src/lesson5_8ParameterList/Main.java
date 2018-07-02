package lesson5_8ParameterList;

public class Main {

    public static void main(String[] args) {
        System.out.println(average(1, 3, 5, 6));
    }

    public static double average(int... values) {
        int result = 0;
        for (int x : values) {
            result += x;
        }
        return (double) result / values.length;
    }
}
