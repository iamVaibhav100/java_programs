package java_programs;

import javax.swing.JOptionPane;

public class FirstGUIApp {
    public static void main(String[] ags) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt((JOptionPane.showInputDialog("Enter your age: ")));
        String stream = JOptionPane.showInputDialog("Enter your stream: ");

        JOptionPane.showMessageDialog(null, "Hi " + name + ", you are "
                + age + " years old and you are studying " + stream + ".");
    }
}
