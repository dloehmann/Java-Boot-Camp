package lesson4_4settergetter;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person();
        peter.setName("Peter");
        peter.setAge(30);

        Person john = new Person();
        john.setName("John");
        john.setAge(28);

        System.out.println(peter.getName() + " is " + peter.getAge());
        System.out.println(john.getName() + " is " + john.getAge());
    }
}
