package github04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create Label
        JLabel label = new JLabel("Press a button");

        // Create Buttons
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        // Add ActionListener for India button
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Add ActionListener for Srilanka button
        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(btnIndia);
        frame.add(btnSrilanka);

        // Make frame visible
        frame.setVisible(true);
    }
}