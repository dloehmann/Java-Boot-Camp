package lesson7_7References;

public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher("John", 42);
        Student s1 = new Student("Kate", 25, t);
        System.out.println(t);
        System.out.println(s1);
        System.out.println();
        t.setName("Dennis");
        System.out.println(t);
        System.out.println(s1);
        System.out.println();
        t = new Teacher("John", 42);
        System.out.println(t);
        System.out.println(s1);
    }


}

