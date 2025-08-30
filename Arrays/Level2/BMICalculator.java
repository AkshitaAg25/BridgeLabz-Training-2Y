import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Loop to take input for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");
            System.out.print("Enter weight in kg: ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Loop to calculate BMI and status
        for (int i = 0; i < numberOfPersons; i++) {
            // BMI Formula: weight (kg) / [height (m)]^2
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Loop to display the results
        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("Height: " + heights[i] + " m");
            System.out.printf("BMI: %.2f\n", bmis[i]);
            System.out.println("Status: " + statuses[i]);
        }

        scanner.close();
    }
}