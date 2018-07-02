package practice2switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What weekday do we have?");
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine();

        System.out.println("Type in your age");
        int age = Integer.parseInt(scanner.nextLine());
        boolean isWeekday= false;
        switch (weekday) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI": isWeekday = true; break;
            case "SAT":
            case "SON": isWeekday = false; break;
        }
        if (isWeekday) {
            if (age < 18) {
                System.out.println("Go to school!");
            } else {
                System.out.println("Go to work!");
            }
        } else {
            System.out.println("Relax!");
        }

    }
}
