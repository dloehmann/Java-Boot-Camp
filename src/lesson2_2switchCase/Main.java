package lesson2_2switchCase;

public class Main {

    public static void main(String[] args) {
        String timeOfDay = "morning";
        switch (timeOfDay) {
            case "morning": {
                System.out.println("Gooood Morning!");
                break;
            }
            case "noon":
            case "afternoon": {
                System.out.println("Time for lunch!");
                break;
            }
            default: {
                System.out.println("Sorry, I don't know " + timeOfDay);
                break;
            }
        }
    }
}
