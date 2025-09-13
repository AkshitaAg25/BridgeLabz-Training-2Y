import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost (assuming $50 per day)
    public double calculateTotalCost() {
        return rentalDays * 50.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental: Customer - " + defaultRental.customerName + ", Car - " + defaultRental.carModel + ", Days - " + defaultRental.rentalDays + ", Total Cost - $" + defaultRental.calculateTotalCost());

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter rental days: ");
        int rentalDays = scanner.nextInt();

        CarRental paramRental = new CarRental(customerName, carModel, rentalDays);
        System.out.println("Parameterized Rental: Customer - " + paramRental.customerName + ", Car - " + paramRental.carModel + ", Days - " + paramRental.rentalDays + ", Total Cost - $" + paramRental.calculateTotalCost());

        scanner.close();
    }
}
