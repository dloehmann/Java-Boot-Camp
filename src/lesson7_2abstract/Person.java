package lesson7_2abstract;

/**
 * @Author Dennis Löhmann (Holisticon AG) 18.06.18
 **/
public abstract class Person {
    public static final String TEACHER = "Teacher";
    public static final String ADMINISTRATOR = "Administrator";
    public static final String DEVELOPER = "Developer";
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getJob();

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
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old and I am a " + this.getJob() +
                ".");
    }

    public Person compare(Person p) {
        if (p.age > this.age) {
            return p;
        }
        return this;
    }
}
