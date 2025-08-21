public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        double profitAmount = sellingPrice - costPrice;
        double profitPercentage = (profitAmount / costPrice) * 100;

        System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice);
        System.out.println("The Profit is INR "+profitAmount+" and the Profit Percentage is "+profitPercentage);

    }
}
