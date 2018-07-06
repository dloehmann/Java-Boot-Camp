package lesson4_1classes;

public class Main {

    public static void main(String[] args) {
    	// creates new class instance/ object
        Person peter = new Person();
        peter.name = "Peter";
        peter.age = 35;
        peter.city = "Durban";
        // calls a method
        peter.speak();

        Person john = new Person();
        john.name = "John";
        john.age = 28;
        john.city = "PMB";
        john.speak();
    }
}
