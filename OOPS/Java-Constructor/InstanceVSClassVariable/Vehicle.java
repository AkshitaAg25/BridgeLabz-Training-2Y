import java.util.Scanner;

public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 100.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter owner name: ");
        String owner = scanner.nextLine();

        System.out.print("Enter vehicle type: ");
        String type = scanner.nextLine();

        Vehicle vehicle = new Vehicle(owner, type);

        vehicle.displayVehicleDetails();

        System.out.print("Enter new registration fee: ");
        double newFee = scanner.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        System.out.println("After update:");
        vehicle.displayVehicleDetails();

        scanner.close();
    }
}
