package Level1;
import java.util.Scanner;
public class Que4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;
        double mean;

        System.out.println("Enter heights of 11 football players:");

        // Taking input
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum = sum + heights[i];
        }

        // Calculating mean
        mean = sum / heights.length;

        System.out.println("Mean height of the football team is: " + mean);

        sc.close();
    }
}