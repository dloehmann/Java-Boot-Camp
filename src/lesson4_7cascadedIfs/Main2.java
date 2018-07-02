package lesson4_7cascadedIfs;

public class Main2 {

    public static void main(String[] args) {
        Person[] persons = new Person[]{new Person("Peter", 30), new Person("John", 28), new Person("Jake", 25)};
        Person oldest = null;

        for (Person p : persons) {
            if (oldest == null || p.olderThan(oldest)) {
                oldest = p;
            }
        }
        System.out.println(oldest.getName() + " is the oldest!");
    }
}
