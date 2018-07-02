package lesson4_7cascadedIfs;

/**
 * @Author Dennis Löhmann (Holisticon AG) 18.06.18
 **/
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public boolean olderThan(Person p) {
        return p.age < this.age;
    }
}
