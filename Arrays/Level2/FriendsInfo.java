import java.util.Scanner;

public class FriendsInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter the age and height for Amar, Akbar, and Anthony.");
        System.out.println("--- All heights should be in meters ---");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter age for %s: ", names[i]);
            ages[i] = scanner.nextInt();
            System.out.printf("Enter height for %s: ", names[i]);
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int minAge = ages[0];
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        double maxHeight = heights[0];
        
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.printf("\nThe youngest friend is %s with an age of %d years.\n", names[youngestIndex], minAge);
        System.out.printf("The tallest friend is %s with a height of %.2f meters.\n", names[tallestIndex], maxHeight);

        scanner.close();
    }
}