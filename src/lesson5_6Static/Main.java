package lesson5_6Static;

public class Main {

    public static void main(String[] args) {
        for (Person p : Person.buildPersonArray()) {
            p.speak();
        }
    }
}
