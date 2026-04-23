package github03;

import java.util.Scanner;
import java.util.Random;

public class RandomStringGenerator {

    // User-defined function
    public static String generateRandomString(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();

        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter desired length: ");
        int length = sc.nextInt();

        // Generate random string
        String randomString = generateRandomString(length);

        // Display result
        System.out.println("Random String: " + randomString);

        sc.close();
    }
}