import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area using the formula: π * r^2
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("Area of the circle: " + area);

        // Close the scanner
        scanner.close();
    }
}

