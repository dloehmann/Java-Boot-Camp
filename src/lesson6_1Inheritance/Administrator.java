package lesson6_1Inheritance;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/

public class Administrator extends Person {

    public Administrator(String name, int age) {
        super(name, age, Person.ADMINISTRATOR);
    }
}
