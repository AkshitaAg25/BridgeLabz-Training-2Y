import java.util.Scanner;

public class NumberFormatDemonstration {

    public static void generateException(String text) {
        System.out.println("Attempting to generate a NumberFormatException...");
        int number = Integer.parseInt(text);
        System.out.println("Parsed number is: " + number);
    }

    public static void handleException(String text) {
        System.out.println("\nDemonstrating how to handle a NumberFormatException...");
        try {
            System.out.println("Attempting to parse string '" + text + "' within a try-catch block...");
            int number = Integer.parseInt(text);
            System.out.println("Parsed number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught the NumberFormatException!");
            System.out.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException.");
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string that cannot be parsed as a number (e.g., 'abc'):");
        String inputString = scanner.next();
        
        // This will generate a runtime exception if the input is not a valid number,
        // and the program will terminate here.
        generateException(inputString);

        // This part of the code will not be reached if the above call fails.
        // To see the exception being handled, you would need to comment out the line above.
        handleException(inputString);
        
        scanner.close();
    }
}