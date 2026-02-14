public class BannerApp {
    public static void main(String[] args) {
        double costPrice = 125.0;
        double sellingPrice = 150.0;

        double profit = sellingPrice - costPrice;
        // Calculation for profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println("Profit: " + profit);
        System.out.println("Profit Percentage: " + profitPercentage + "%");
    }
}