package lesson7_8Equals;

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
        return STUDENT;
    }

    public String toString() {
        return "Hello, my name is " + getName() + " and I am " + getAge() + " years old and I am a " + this.getJob() +
                ". My teacher is " + teacher.getName() + ".";
    }

    public boolean equals(Student o) {
        return this.getName().equals(o.getName()) && this.getAge() == o.getAge() && this.getTeacher().equals(o
                .getTeacher());
    }

}
