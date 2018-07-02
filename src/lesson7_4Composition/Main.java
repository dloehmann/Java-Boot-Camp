package lesson7_4Composition;

public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher("John", 42);
        Student s1 = new Student("Kate", 25, t);
        Student s2 = new Student("Jake", 33, t);

        System.out.println(t);
        System.out.println(s1);
        System.out.println(s2);

    }


}

