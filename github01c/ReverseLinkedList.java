package github01c;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        // Display original list
        System.out.println("Original List: " + list);

        // Using descendingIterator() for reverse traversal
        Iterator<String> iterator = list.descendingIterator();

        System.out.print("Elements in reverse order: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}