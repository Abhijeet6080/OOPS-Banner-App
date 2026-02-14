public class BannerApp {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        // Type conversion to double for the percentage calculation
        double profitPercentage = (profit / (double)costPrice) * 100;

        // Requirement: Single print statement for multiline output
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                        "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}