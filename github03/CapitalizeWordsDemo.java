package github03;

import java.util.Scanner;

public class CapitalizeWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+"); // split by spaces
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + rest in lowercase
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim(); // remove trailing space
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Capitalizing words
        String output = capitalizeWords(input);

        // Display result
        System.out.println("Capitalized String: " + output);

        sc.close();
    }
}