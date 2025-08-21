import java.util.Scanner;

public class TotalPriceCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the unit price of the item:");
        double unitPrice = input.nextDouble();

        System.out.println("Enter the quantity to be bought:");
        int quantity = input.nextInt();

        double totalPurchasePrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPurchasePrice, quantity, unitPrice);

        input.close();
    }
}
