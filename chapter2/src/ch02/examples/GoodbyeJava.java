package ch02.examples;

import javax.swing.*;


public class GoodbyeJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ch02.examples.GoodbyeJava");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Goodbye, Java!", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

}
