package lesson4_3MessageDialog;

import javax.swing.*;

/**
 * @Author Dennis Löhmann (Holisticon AG) 20.06.18
 **/
public class Main {

    public static void main(String[] args) {
        int like = JOptionPane.showConfirmDialog(null, "Do you like me?");
        System.out.println(like);

        if (like == 0) {
            JOptionPane.showMessageDialog(null, "Nice!");
        } else if (like == 1) {
            JOptionPane.showMessageDialog(null, "Go away!");
        } else if (like == 2) {
            JOptionPane.showMessageDialog(null, "Bye bye");
        }

    }
}
