import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println("Distance in miles: " + miles);

        // Close the scanner
        scanner.close();
    }
}

