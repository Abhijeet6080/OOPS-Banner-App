package Level2;

import java.util.Scanner;

public class Que7 {

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

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0, wordIndex = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // Last word
        words[wordIndex] = text.substring(start);

        return words;
    }

    // Method to create 2D array (word + length)
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Input
            System.out.print("Enter a sentence: ");
            String text = sc.nextLine();

            // Split words
            String[] words = splitText(text);

            // Create 2D array
            String[][] wordData = createWordLengthArray(words);

            // Display in tabular format
            System.out.println("\nWord\tLength");

            for (int i = 0; i < wordData.length; i++) {
                String word = wordData[i][0];
                int length = Integer.parseInt(wordData[i][1]); // convert back to int

                System.out.println(word + "\t" + length);
            }
        }
    }
}