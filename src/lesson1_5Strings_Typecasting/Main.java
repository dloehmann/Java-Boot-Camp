package lesson1_5Strings_Typecasting;

public class Main {

    public static void main(String[] args) {
        String string1 = "I am a String";
        String string2 = "25";
        int wert1 = Integer.parseInt(string2);
        String string3 = String.valueOf(wert1);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }
}
