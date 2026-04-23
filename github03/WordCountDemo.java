package github03;

import java.util.Scanner;

public class WordCountDemo {

    // User-defined function
    public static int countWords(String str) {

        // Check for null or empty string
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string based on whitespace
        String[] words = str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Counting words
        int count = countWords(input);

        // Display result
        System.out.println("Number of words: " + count);

        sc.close();
    }
}