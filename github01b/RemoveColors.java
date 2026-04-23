package github01b;

import java.util.ArrayList;

public class RemoveColors {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Removing 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);
            System.out.println("After removing 2nd element: " + colors);
        }

        // Removing color "Blue"
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}