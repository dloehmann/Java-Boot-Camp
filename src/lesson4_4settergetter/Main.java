package lesson4_4settergetter;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person();
        peter.setName("Peter");
        peter.setAge(30);

        Person john = new Person();
        john.setName("John");
        john.setAge(28);

        Dog brutus = new Dog();
        brutus.setName("Brutus");
        brutus.setAge(5);
        brutus.setOwner(peter);

        System.out.println(peter.getName() + " is " + peter.getAge());
        System.out.println(john.getName() + " is " + john.getAge());
        System.out.println(brutus.getName() + " is " + brutus.getAge() + " years and belongs to " + brutus.getOwner());
    }
}
