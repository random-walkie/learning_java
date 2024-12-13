package ch02.examples;
//import line at the top is necessary to tell the Java compiler where to find the definitions
// of the JFrame and JLabel
import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args) {
        // System.out.println("Hello, Java!"); // println() to write some text as output
        // If we leave the program with just the line above
        // this will make it a command-line program, which means that
        // it runs in a terminal or DOS window and prints its output there.
        // This approach is a bit old-school, so before we go any further,
        // we’re going to give ch02.examples.HelloJava a graphical user interface (GUI).
        JFrame frame = new JFrame("Hello, Java!"); //This snippet creates a JFrame object with the title
        // “Hello, Java!” JFrame represents a graphical window.
        // JLabel label = new JLabel("Hello, World!", JLabel.CENTER); // JLabel object to display the text centered in our window
        // frame.add(label); // method add , adds label instance to frame instance
        // Add this line to illustrate an object-oriented structure
        frame.add(new HelloComponent());
        frame.setSize(300, 150); //  configure its size on the screen using the setSize()
        frame.setVisible(true); // make it visible by calling the setVisible()
    }

}

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 125, 95);
    }
}