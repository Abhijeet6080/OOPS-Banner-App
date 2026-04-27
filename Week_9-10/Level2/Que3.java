package Level2;

import java.util.Scanner;

public class Que3 {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text manually using charAt()
    public static String[] splitText(String text) {

        int len = findLength(text);

        // Step 1: Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // Step 3: Extract words
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            start = end + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Input
            System.out.print("Enter a sentence: ");
            String text = sc.nextLine();

            // Manual split
            String[] manualWords = splitText(text);

            // Built-in split
            String[] builtInWords = text.split(" ");

            // Compare results
            boolean isSame = compareArrays(manualWords, builtInWords);

            // Display results
            System.out.println("\nManual Split:");
            for (String word : manualWords) {
                System.out.println(word);
            }

            System.out.println("\nBuilt-in Split:");
            for (String word : builtInWords) {
                System.out.println(word);
            }

            System.out.println("\nAre both results same? " + isSame);
        }
    }
}