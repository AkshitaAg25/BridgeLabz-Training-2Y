import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get the base from the user
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Get the exponent from the user
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the result using Math.pow()
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

