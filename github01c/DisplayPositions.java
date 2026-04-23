package github01c;

import java.util.LinkedList;

public class DisplayPositions {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Adding elements
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");
        l_listobj.add("Yellow");
        l_listobj.add("Black");

        // Display elements with positions
        System.out.println("Elements and their positions:");

        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + " : " + l_listobj.get(p));
        }
    }
}