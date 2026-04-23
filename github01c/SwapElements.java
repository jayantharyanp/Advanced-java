package github01c;

import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> l_list = new LinkedList<>();

        // Adding elements
        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Green");
        l_list.add("Yellow");

        // Display original list
        System.out.println("Original List: " + l_list);

        // Swapping first (index 0) and third (index 2) elements
        if (l_list.size() > 2) {
            Collections.swap(l_list, 0, 2);
            System.out.println("List after swapping 1st and 3rd elements: " + l_list);
        } else {
            System.out.println("List does not have enough elements to swap.");
        }
    }
}