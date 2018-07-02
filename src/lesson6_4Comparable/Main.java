package lesson6_4Comparable;

public class Main {

    public static void main(String[] args) {
        Person t = new Teacher("John", 42);
        Person d = new Developer("Kate", 25);
        Person a = new Administrator("Jake", 33);

        Person[] p = new Person[]{a, d, t};
        System.out.println("t to d: " + t.compareTo(d));
        System.out.println("d to a: " + d.compareTo(a));
    }

}

