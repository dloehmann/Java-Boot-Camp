package lesson4_1classes;

/**
 * @Author Dennis Löhmann (Holisticon AG) 18.06.18
 **/
public class Person {
    // variable definitions
    public String name;
    public int age;
	public String city;

    // method definition
    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I am from " + city);
    }
}
