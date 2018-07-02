package lesson7_3toString;

public class Main {

    public static void main(String[] args) {
        Person t = new Teacher("John", 42);
        Person d = new Developer("Kate", 25);
        Person a = new Administrator("Jake", 33);

        Person[] persons = new Person[]{a, d, t};
        for (Person p : persons) {
            System.out.println(p);
        }

    }

}

