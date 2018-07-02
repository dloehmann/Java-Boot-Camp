package lesson4_7cascadedIfs;

public class Main {

    public static void main(String[] args) {
        Person peter = new Person("Peter", 30);
        Person john = new Person("John", 28);
        Person jake = new Person("Jake", 25);
        Person oldest;

        if (peter.olderThan(john)) {
            if (peter.olderThan(jake)) {
                oldest = peter;
            } else {
                oldest = jake;
            }
        } else {
            if (john.olderThan(jake)) {
                oldest = john;
            } else {
                oldest = jake;
            }
        }
        System.out.println(oldest.getName() + "is the oldest!");
    }
}
