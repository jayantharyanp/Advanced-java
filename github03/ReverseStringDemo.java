package github03;

import java.util.Scanner;

public class ReverseStringDemo {

    // User-defined function
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling function
        String result = reverseString(input);

        // Display result
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}