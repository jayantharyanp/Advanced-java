package github04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create Label
        JLabel label = new JLabel("Press a button");

        // Load Images (Make sure images exist in your project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with images
        JButton btnClock = new JButton("Digital Clock", clockIcon);
        JButton btnHourGlass = new JButton("Hour Glass", hourglassIcon);

        // ActionListener for Digital Clock
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // ActionListener for Hour Glass
        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        // Make frame visible
        frame.setVisible(true);
    }
}