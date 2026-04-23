package github01b;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
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

        // Extracting 1st and 2nd elements using subList()
        // subList(startIndex, endIndex) → endIndex is exclusive
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted SubList (1st and 2nd elements): " + subList);
    }
}