package github01c;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Adding initial elements
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        // Display original list
        System.out.println("Original List: " + l_listobj);

        // Inserting element at the end using offerLast()
        l_listobj.offerLast("Pink");

        // Display updated list
        System.out.println("List after adding 'Pink' at the end: " + l_listobj);
    }
}