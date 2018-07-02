package lesson4_1classes;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person();
        peter.name = "Peter";
        peter.age = 30;
        peter.speak();

        Person john = new Person();
        john.name = "John";
        john.age = 28;
        john.speak();
    }
}
