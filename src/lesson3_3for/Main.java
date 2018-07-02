package lesson3_3for;

public class Main {

    public static void main(String[] args) {
        String[] bigFive = new String[]{"Lion", "rhino", "leopard", "buffalo", "elephant"};
        for (int i = 0; i < bigFive.length; i++) {
            System.out.println(bigFive[i]);
        }
        System.out.println();
        for (String s : bigFive) {
            System.out.println(s);
        }
    }
}
