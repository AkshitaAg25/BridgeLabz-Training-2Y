import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // Get the Rate of interest
        System.out.print("Enter the Rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Get the Time in years
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}

