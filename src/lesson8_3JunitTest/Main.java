package lesson8_3JunitTest;

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[]{"I", "am", "happy", "to", "be", "here"};
        for (int i = 0; i < strArray.length; i++) {
//        for (int i=0; i<6; i=i+1) {
            System.out.println(i + " " + strArray[i]);
        }
        System.out.println();
        String result = "";
        for (String s : strArray) {
            result += s + " ";
        }
        result += ":)";
        System.out.println(result);


    }
}
