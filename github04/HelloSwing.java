package github04;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JLabel with message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        // Set font: Plain, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to Blue
        label.setForeground(Color.BLUE);

        // Align text to center
        label.setHorizontalAlignment(JLabel.CENTER);

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}