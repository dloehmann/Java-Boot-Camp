package lesson7_3toString;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/

public class Developer extends Person {

    public Developer(String name, int age) {
        super(name, age);
    }


    public String getJob() {
        return Person.DEVELOPER;
    }
}
