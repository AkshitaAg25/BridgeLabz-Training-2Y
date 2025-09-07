import java.util.Scanner;
import java.text.DecimalFormat;

public class BMICalculator {

    private static final int NUM_MEMBERS = 10;
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] personData = new double[NUM_MEMBERS][2];

        System.out.println("Please enter the weight (in kg) and height (in cm) for 10 people.");
        for (int i = 0; i < NUM_MEMBERS; i++) {
            System.out.println("\nEnter data for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        String[][] results = calculateBmiAndStatus(personData);

        displayResults(results);
        
        scanner.close();
    }

    private static String[][] calculateBmiAndStatus(double[][] personData) {
        String[][] resultsArray = new String[NUM_MEMBERS][4];

        for (int i = 0; i < NUM_MEMBERS; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];

            double heightInMeters = heightInCm / 100.0;
            
            double bmi = weight / (heightInMeters * heightInMeters);
            
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            resultsArray[i][0] = String.valueOf(heightInCm);
            resultsArray[i][1] = String.valueOf(weight);
            resultsArray[i][2] = df.format(bmi);
            resultsArray[i][3] = status;
        }

        return resultsArray;
    }

    private static void displayResults(String[][] results) {
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < results.length; i++) {
            String personNumber = "Person " + (i + 1);
            String height = results[i][0];
            String weight = results[i][1];
            String bmi = results[i][2];
            String status = results[i][3];
            
            System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", personNumber, height, weight, bmi, status);
        }
    }
}
