import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

