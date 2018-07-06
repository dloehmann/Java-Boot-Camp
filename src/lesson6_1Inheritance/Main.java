package lesson6_1Inheritance;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", 42);
        Developer developer = new Developer("Kate", 25);
        Administrator admin = new Administrator("Jake", 33);
        teacher.teach();
        developer.develop();
        admin.speak();
    }
}

