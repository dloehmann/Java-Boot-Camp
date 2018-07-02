package lesson4_6trycatch;

public class Main {

    public static void main(String[] args) {
        Person p = null;
        try {
            p.speak();
        } catch (NullPointerException e) {
            System.out.println("You forgot to init your person");
        } finally {
            p = new Person();
            p.name = "Some guy";
            p.speak();
        }
        System.out.println("Program terminated.");
    }
}
