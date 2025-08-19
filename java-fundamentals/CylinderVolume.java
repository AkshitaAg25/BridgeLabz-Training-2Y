import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt user to enter height
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate volume using the formula: π * r^2 * h
        double volume = Math.PI * radius * radius * height;

        // Display the result
        System.out.println("Volume of the cylinder: " + volume);

        // Close the scanner
        scanner.close();
    }
}

