public class BannerApp {
    public static void main(String[] args) {
        // Step 1: Initialize variables
        double fee = 125000;
        double discountPercent = 10;

        // Step 2: Compute discount amount
        double discount = (fee * discountPercent) / 100;

        // Step 3: Compute final discounted fee
        double finalFee = fee - discount;

        // Step 4: Output exactly as required
        System.out.println("The discount amount is INR " + (int)discount + " and final discounted fee is INR " + (int)finalFee);
}
}