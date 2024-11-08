//file: HelloJava2.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloJava2");
        frame.add(new HelloComponent2(args[0]));
        // the line above is equivalent to:
        // HelloComponent2 newObject = new HelloComponent2(args[0]);
        // frame.add(newObject)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent2 extends JComponent
        implements MouseMotionListener { // MouseMotionListener is an interface
    String theMessage; // this is an instance variable
    int messageX = 125, messageY = 95; // Coordinates of the message; these are also instance variables

    public HelloComponent2(String message) { // this is a constructor
        theMessage = message;
        addMouseMotionListener(this); // this is an event listener
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) { // e is an Event object
        // Save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) { }
}
