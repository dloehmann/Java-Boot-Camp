package lesson7_8Interfaces;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String getJob() {
        return TEACHER;
    }


}
