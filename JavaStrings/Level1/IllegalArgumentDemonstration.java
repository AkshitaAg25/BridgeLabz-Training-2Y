import java.util.Scanner;

public class IllegalArgumentDemonstration {

    public static void generateException(String str, int startIndex, int endIndex) {
        System.out.println("Attempting to generate IllegalArgumentException...");
        System.out.println("Subtring: " + str.substring(startIndex, endIndex));
    }

    public static void handleException(String str, int startIndex, int endIndex) {
        System.out.println("\nDemonstrating how to handle IllegalArgumentException...");
        try {
            System.out.println("Attempting substring with try-catch block...");
            System.out.println("Substring: " + str.substring(startIndex, endIndex));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught the IllegalArgumentException!");
            System.out.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException.");
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.next();

        System.out.println("Enter the start index:");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the end index:");
        int endIndex = scanner.nextInt();
        
        // This will generate a runtime exception if the start index is greater than the end index,
        // and the program will terminate here.
        generateException(inputString, startIndex, endIndex);

        // This part of the code will not be reached if the above call fails.
        // To see the exception being handled, you would need to comment out the line above.
        handleException(inputString, startIndex, endIndex);
        
        scanner.close();
    }
}
