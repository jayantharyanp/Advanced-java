package github01b;

import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display colors
        System.out.println("List of colors: " + colors);

        // Searching for "Red"
        if (colors.contains("Red")) {
            System.out.println("Red is available in the list.");
        } else {
            System.out.println("Red is not available in the list.");
        }
    }
}