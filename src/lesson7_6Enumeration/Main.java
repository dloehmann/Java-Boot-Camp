package lesson7_6Enumeration;

public class Main {

    public static void main(String[] args) {
        Person t = new Person("John", 42, Jobs.TEACHER);
        Person s1 = new Person("Kate", 25, Jobs.STUDENT);
        Person s2 = new Person("Jake", 33, Jobs.STUDENT);

        System.out.println(t);
        System.out.println(s1);
        System.out.println(s2);
    }
}
