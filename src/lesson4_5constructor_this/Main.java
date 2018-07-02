package lesson4_5constructor_this;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person("Peter", 30);
        Person john = new Person("John", 28);

        System.out.println(peter.getName() + " is " + peter.getAge());
        System.out.println(peter.compare(john).getName() + " is older!");
    }
}
