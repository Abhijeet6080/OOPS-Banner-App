package Level2;

import java.util.Scanner;

public class Que1 {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // access character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception stops loop
        }

        return count;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Input
            System.out.print("Enter a string: ");
            String text = sc.next();

            // Custom method
            int manualLength = findLength(text);

            // Built-in method
            int actualLength = text.length();

            // Output
            System.out.println("Length using custom method: " + manualLength);
            System.out.println("Length using length(): " + actualLength);

            if (manualLength == actualLength) {
                System.out.println("Both results are SAME.");
            } else {
                System.out.println("Results are DIFFERENT.");
            }
        }
    }
}

