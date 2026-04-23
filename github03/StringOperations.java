package github03;

import java.util.*;

public class StringOperations {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String space = "   Welcome Java   ";
        System.out.println("Before trim: '" + space + "'");
        System.out.println("After trim: '" + space.trim() + "'");

        // 8. String Concatenation
        String concat = s1 + " " + s2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("Split result:");
        for (String f : arr) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Arun", 90);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation
        String email = "user@gmail.com";
        if (email.contains("@") &&
            email.startsWith("user") &&
            (email.endsWith(".com") || email.endsWith(".org"))) {
            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email: " + email);
        }
    }
}