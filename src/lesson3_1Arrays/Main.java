package lesson3_1Arrays;

public class Main {

    public static void main(String[] args) {
        String[] bigFive = new String[]{"Lion", "rhino", "leopard", "buffalo", "elephant"};
        System.out.println(bigFive[0]);
        System.out.println(bigFive[1]);
        System.out.println(bigFive[2]);
        bigFive[3] = "Cat";
        System.out.println(bigFive[3]);
        System.out.println(bigFive[4]);
        
    }
}
