package lesson6_1Inheritance;

public class Main {

    public static void main(String[] args) {
        Person t = new Teacher("John", 42);
        Person d = new Developer("Kate", 25);
        Person a = new Administrator("Jake", 33);
        t.speak();
        d.speak();
        a.speak();
    }
}

