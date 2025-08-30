import java.util.Scanner;

public class FactorFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
        input.close();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        System.out.println("Finding factors for " + number + "...");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    System.out.println("Factors array is full. Resizing...");
                    
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    
                    factors = temp;
                }
                
                factors[index] = i;
                index++;
            }
        }
        
        System.out.print("The factors of " + number + " are: ");
        
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}