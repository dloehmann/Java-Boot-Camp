package week1;

/**
 * @Author Dennis Löhmann 11.07.18
 **/
public class TextAnalyzer {

    public static void main(String[] args) {
        String text = "Hi everyone! Here are some programming assignments for this week:\n" +
                "\n" +
                "1. Write a program that takes this text (just copy and paste it into the sourcecode) and counts the occurrences of each letter. The output shall be like: \n" +
                "a: 27\n" +
                "b: 25\n" +
                "c: 10\n" +
                "...\n" +
                "z: 15\n" +
                "\n" +
                "Hint: use an array of chars (char[])\n" +
                "Which letter is used at most?\n" +
                "\n" +
                "2. Write a class Cuboid that models a cuboid with lenght x, width y, height z. Use a constructor public Cuboid(int x, int y, int z) and getter methods for x,y,z, but no setters.\n" +
                "\n" +
                "3. Write a method on the Cuboid: getVolume() that returns the volume of the cuboid: vol = x*y*z\n" +
                "\n" +
                "4. Write a main method to test your cuboid:\n" +
                "\n" +
                "Cuboid c = new Cuboid(2,3,4);\n" +
                "System.out.println(c.getVolume()); // should print 24\n" +
                "\n" +
                "Hope you have a nice week!\n" +
                "\n" +
                "Enjoy!\n" +
                "Dennis";


        System.out.println((int)'a');
        System.out.println((char)(int)'a');
        System.out.println((int)'0');
        System.out.println((int)'9');
        System.out.println((int)' ');
        System.out.println((int)'%');
        int[] result = new int[30];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
        for (char c : text.toLowerCase().toCharArray()) {
            int i = ((int) c);
            if (i >= 97 && i < 97+26) {
                result[i-97]++;
            } else
            if (i >= 48 && i < 58) {
                result[26]++;
            } else            if (c == ' ') {
                result[27]++;
            } else
            if (c == '\n') {
                result[28]++;
            } else {
                result[29]++;
            }
        }
        System.out.println("Result:");
        int most = 0;
        for (int i = 0; i < 26; i++) {
            if (result[i] > result[most]) {
                most = i;
            }
            System.out.println((char)(i+97) + " : "+  result[i]);
        }
        System.out.println("nums       : "+  result[26]);
        System.out.println("spaces     : "+  result[27]);
        System.out.println("linebreaks : "+  result[28]);
        System.out.println("others     : "+  result[29]);
        System.out.println();
        System.out.println("The most frequent letter is '" + (char)(most+97) + "'.");
    }
}
