package lesson6_2Polymorphism;

public class Main {

    public static void main(String[] args) {
        Person t = new Teacher("John", 42);
        Person d = new Developer("Kate", 25);
        Person a = new Administrator("Jake", 33);

        Person[] p = new Person[]{a, d, t};
        System.out.println("Together, they have " + sumUpAge(a, d, t) + " years of experience.");
    }

    public static int sumUpAge(Person... persons) {
        int i = 0;
        for (Person p : persons) {
            i += p.getAge();
        }
        return i;
    }
}

