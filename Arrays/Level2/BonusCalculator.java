import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = 10;
        double[][] employeeData = new double[numberOfEmployees][2];
        double[] bonusAmounts = new double[numberOfEmployees];
        double[] newSalaries = new double[numberOfEmployees];
        
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Enter the salary and years of service for each of the 10 employees:");

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("--- Employee " + (i + 1) + " ---");
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            double yearsOfService = scanner.nextDouble();

            if (salary < 0 || yearsOfService < 0) {
                System.out.println("Invalid number. Please enter a non-negative value.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
            totalOldSalary += salary;
        }

        System.out.println("\nCalculating bonuses...");

        for (int i = 0; i < numberOfEmployees; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            bonusAmounts[i] = bonus;
            newSalaries[i] = newSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("\n--- Bonus Payout Summary ---");
        System.out.printf("Total Old Salary: $%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: $%.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid Out: $%.2f\n", totalBonus);

        scanner.close();
    }
}