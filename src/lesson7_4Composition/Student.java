package lesson7_4Composition;

/**
 * @Author Dennis Löhmann (Holisticon AG) 21.06.18
 **/
public class Student extends Person {

    private Teacher teacher;

    public Student(String name, int age, Teacher teacher) {
        super(name, age);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getJob() {
        return Person.STUDENT;
    }

    public String toString() {
        return "Hello, my name is " + getName() + " and I am " + getAge() + " years old and I am a " + this.getJob() +
                ". My teacher is " + teacher.getName() + ".";
    }

}
