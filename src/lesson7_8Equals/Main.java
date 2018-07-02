package lesson7_8Equals;

public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher("John", 42);
        Student s1 = new Student("Kate", 25, t);
        Student s2 = new Student("Kate", 25, t);
        System.out.println("    ==: " + (s1 == s2));
        System.out.println("equals: " +  s1.equals(s2));
    }


}

