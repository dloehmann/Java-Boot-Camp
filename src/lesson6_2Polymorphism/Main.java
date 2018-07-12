package lesson6_2Polymorphism;

public class Main {

    public static void main(String[] args) {
        Person t = new Teacher("John", 42);
        Person d = new Developer("Kate", 25);
        Person a = new Administrator("Jake", 30);

        Person[] p = new Person[]{a, d, t};
        System.out.println(Math.min(3, 5));
        System.out.println("Together, they have an average age of " + averageAge(a, d, t) + " years.");
    }

    public static int averageAge(Person... persons) {
        int i = 0;
        for (Person p : persons) {
            i += p.getAge();
        }
        return i / persons.length;
    }
}

