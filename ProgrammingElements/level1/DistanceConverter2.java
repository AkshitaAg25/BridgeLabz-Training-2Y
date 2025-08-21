import java.util.Scanner;

public class DistanceConverter2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the distance in feet:");
        double distanceInFeet = input.nextDouble();
        
        // 1 yard = 3 feet, so to get yards, we divide by 3
        double distanceInYards = distanceInFeet / 3;
    
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("The total yards is %.2f and total miles is %.2f for the given %.2f feet%n", distanceInYards, distanceInMiles, distanceInFeet);
        
        input.close();
    }
}