package lesson6_1Inheritance;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/

public class Developer extends Person {

    public Developer(String name, int age) {
        super(name, age, Person.DEVELOPER);
    }
    
    public void develop() {
    	
    }
}
