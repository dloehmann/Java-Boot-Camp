package lesson3_3for;

public class Main {

    public static void main(String[] args) {
        String[] bigFive = new String[]{"Lion", "rhino", "leopard", "buffalo", "elephant"};
        //count forward
        for (int i = 0; i < bigFive.length; i++) {
            System.out.println(bigFive[i]);
        }
        System.out.println();

        // count backward
        for (int i = bigFive.length-1; i >= 0 ; i--) {
            System.out.println(bigFive[i]);
        }
        System.out.println();
        
        // iterate: for each String s out of bigFive do
        for (String s : bigFive) {
            System.out.println(s);
        }
    }
}
