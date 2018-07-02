package lesson4_2methods_params;

/**
 * @Author Dennis Löhmann (Holisticon AG) 18.06.18
 **/
public class Person {
    public String name;
    public int age;

    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public Person compare(Person p) {
        if (p.age > this.age) {
            return p;
        }
        return this;
    }
}
