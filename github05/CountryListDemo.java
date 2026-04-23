package github05;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);

        // Set selection mode (single selection)
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Avoid duplicate events
                if (!e.getValueIsAdjusting()) {
                    String selected = countryList.getSelectedValue();
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        // Add JList to JScrollPane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}