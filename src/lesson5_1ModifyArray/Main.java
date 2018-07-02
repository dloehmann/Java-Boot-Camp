package lesson5_1ModifyArray;

public class Main {

    public static void main(String[] args) {
        String[] bigFive = new String[]{"Lion", "Rhino", "Leopard", "Buffalo", "Elephant"};
        bigFive[3] = "Scratch";

        System.out.println(bigFive[0]);
        System.out.println(bigFive[1]);
        System.out.println(bigFive[2]);
        System.out.println(bigFive[3]);
        System.out.println(bigFive[4]);

    }
}
