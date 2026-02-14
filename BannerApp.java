import java.util.Scanner;

public class BannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Step 1: Convert total cm to total inches
        double totalInches = heightCm / 2.54;

        // Step 2: Calculate feet (integer division)
        int feet = (int) (totalInches / 12);

        // Step 3: Calculate remaining inches
        double inches = totalInches % 12;

        // Output exactly as required
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
        
        sc.close();
    }
}