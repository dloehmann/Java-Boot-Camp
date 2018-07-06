package lesson4_5constructor_this;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person("Peter", 30);
        Person john = new Person("John", 28);
        Person jake = null;
        Dog brutus = new Dog("Brutus", 5, jake);

        System.out.println(peter.getName() + " is " + peter.getAge());
        System.out.println(peter.compare(john).getName() + " is older!");
        try {
        	System.out.println(brutus.getName() + " is " + brutus.getAge() + " years and belongs to " + brutus.getOwner().getName());
        } catch (Exception e) {
        	System.out.println(brutus.getName() + " is " + brutus.getAge() + " years and belongs to Owner Unknown");
        }
    }
}
