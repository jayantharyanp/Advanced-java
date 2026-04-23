package github03;

import java.util.Scanner;

public class TruncateStringDemo {

    // User-defined function
    public static String truncate(String str, int maxLength) {

        // If string is null, return empty
        if (str == null) {
            return "";
        }

        // If length is less than or equal to maxLength, return original string
        if (str.length() <= maxLength) {
            return str;
        }

        // Otherwise truncate and add ellipsis
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter maximum length: ");
        int length = sc.nextInt();

        // Truncating string
        String result = truncate(input, length);

        // Display result
        System.out.println("Truncated String: " + result);

        sc.close();
    }
}