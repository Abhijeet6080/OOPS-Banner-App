package Level1;

import java.util.Scanner;

public class Que3 {

    // Method to convert string to char array using charAt()
    public static char[] getCharsManual(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // try-with-resources to avoid resource leak
        try (Scanner sc = new Scanner(System.in)) {

            // Input
            System.out.print("Enter a string: ");
            String text = sc.next();

            // User-defined method
            char[] manualArray = getCharsManual(text);

            // Built-in method
            char[] builtInArray = text.toCharArray();

            // Compare arrays
            boolean isSame = compareCharArrays(manualArray, builtInArray);

            // Display arrays
            System.out.print("Manual char array: ");
            for (char c : manualArray) {
                System.out.print(c + " ");
            }

            System.out.println();

            System.out.print("Built-in char array: ");
            for (char c : builtInArray) {
                System.out.print(c + " ");
            }

            System.out.println();

            // Result
            if (isSame) {
                System.out.println("Both arrays are SAME.");
            } else {
                System.out.println("Arrays are DIFFERENT.");
            }
        }
    }
}
