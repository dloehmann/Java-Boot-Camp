package lesson7_6Enumeration;

/**
 * @Author Dennis Löhmann (Holisticon AG) 18.06.18
 **/
public class Person {
    private String name;
    private int age;
    private Jobs job;

    public Person(String name, int age, Jobs job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Jobs getJob() {
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

    public String toString() {
        return ("Hello, my name is " + name + " and I am " + age + " years old and I am a " + this.job.toString() +
                ". I may " + (this.job.canTeach ? "" : " not ") + " teach and my hobby is " + this.job.hobby);
    }

    public Person compare(Person p) {
        if (p.age > this.age) {
            return p;
        }
        return this;
    }
}
