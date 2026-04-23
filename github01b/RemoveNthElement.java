package github01b;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthElement {
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

        // Taking input for n (position)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n) to remove: ");
        int n = sc.nextInt();

        // Removing nth element (index = n-1)
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1);
            System.out.println("List after removing " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}