package lesson6_2Polymorphism;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age, Person.TEACHER);
    }
}
