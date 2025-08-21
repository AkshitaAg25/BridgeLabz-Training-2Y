import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the base of the triangle in cm:");
        double baseCm = input.nextDouble();
        
        System.out.println("Enter the height of the triangle in cm:");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        
        // Conversion factor from cm to inches: 1 inch = 2.54 cm
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        double areaInches2 = 0.5 * baseInches * heightInches;

        System.out.printf("The area of the triangle is %.2f sq cm and %.2f sq inches%n", areaCm2, areaInches2);

        input.close();
    }
}
