package lesson2_2switchCase;

public class Main {

    public static void main(String[] args) {
        String timeOfDay = "afternoon";
        if ("morning".equals(timeOfDay)) {
            System.out.println("Gooood Morning!");
        } else
        if ("noon".equals(timeOfDay)) {
            System.out.println("Time for lunch!");
        } else
        if ("afternoon".equals(timeOfDay)) {
            System.out.println("Time for lunch!");
        } else
        {
            System.out.println("Sorry, I don't know " + timeOfDay);
        }
        
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
