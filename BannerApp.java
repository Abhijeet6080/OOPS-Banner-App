import java.util.Scanner;

public class BannerApp {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input: Student Fee
        System.out.print("Enter the Student Fee: ");
        double fee = sc.nextDouble();

        // Input: University Discount Percentage
        System.out.print("Enter the University Discount Percent: ");
        double discountPercent = sc.nextDouble();

        // Step 1: Compute the discount amount
        double discount = (fee * discountPercent) / 100;

        // Step 2: Compute final fee to be paid
        double finalFee = fee - discount;

        // Output exactly as required
        System.out.println("The discount amount is INR " + (int)discount +" and final discounted fee is INR " + (int)finalFee);
        
        sc.close();
    }
}