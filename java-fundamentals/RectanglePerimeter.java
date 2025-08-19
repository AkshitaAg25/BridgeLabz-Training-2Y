import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Ask the user to enter the width
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 2 * (length + width);

        // Display the result
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}

