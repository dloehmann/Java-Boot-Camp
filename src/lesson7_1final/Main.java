package lesson7_1final;

public class Main {

    private static final int CONST = 42;
    private final int finalNumber = 42;

    public static void main(String[] args) {
        Person d = new Developer("Kate", 25);


        Person[] p = new Person[]{d};

        System.out.println("Together, they have " + sumUpAge(d) + " years of experience.");
    }

    public static int sumUpAge(Person... persons) {
        int i = 0;
        for (Person p : persons) {
            i += p.getAge();
        }
        return i;
    }


}

