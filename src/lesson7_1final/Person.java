package lesson7_1final;

/**
 * @Author Dennis Löhmann (Holisticon AG) 18.06.18
 **/
public class Person {

    public static final String TEACHER = "Teacher";
    public static final String ADMINISTRATOR = "Administrator";
    public static final String DEVELOPER = "Developer";
    protected String job;
    private String name;
    private int age;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static Person[] buildPersonArray() {
        return new Person[]{new Person("Peter", 25, TEACHER), new Person("Jack", 25, TEACHER)};
    }

    public final String getJob() {
        return job;
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
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old and I am a " + this.job +
                ".");
    }

    public Person compare(Person p) {
        if (p.age > this.age) {
            return p;
        }
        return this;
    }
}
