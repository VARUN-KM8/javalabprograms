// Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()

package first;

import java.util.Random;

public class _3c4 {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateRandomString(8));
    }
}