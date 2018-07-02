package lesson3_2while;

public class Main {
    private static int classCapacity = 10;

    public static boolean isClassFull(int participants) {
        return participants >= classCapacity;
    }

    public static void main(String[] args) {
        int participants = 0;
        while (!isClassFull(participants)) {
            System.out.println("Hello, come in!");
            participants++;
        }
        System.out.println("Sorry, we're full!");
    }
}
