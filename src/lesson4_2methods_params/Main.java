package lesson4_2methods_params;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person();
        peter.name = "Peter";
        peter.age = 30;

        Person john = new Person();
        john.name = "John";
        john.age = 28;

        System.out.println(peter.compare(john).name + " is older!");
    }
}
