package github01c;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListIteration {
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

        // Creating iterator starting at 2nd position (index 1)
        ListIterator<String> iteratorObj = list.listIterator(1);

        // Iterating from 2nd element
        System.out.print("Elements from 2nd position: ");
        while (iteratorObj.hasNext()) {
            System.out.print(iteratorObj.next() + " ");
        }
    }
}