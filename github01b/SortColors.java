package github01b;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sorting the ArrayList
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}