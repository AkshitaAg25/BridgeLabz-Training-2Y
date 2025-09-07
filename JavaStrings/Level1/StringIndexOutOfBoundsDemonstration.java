import java.util.Scanner;

public class StringIndexOutOfBoundsDemonstration {

    public static void generateException(String str, int index) {
        System.out.println("Attempting to access character at index " + index + "...");
        System.out.println("Character is: " + str.charAt(index));
    }

    public static void handleException(String str, int index) {
        System.out.println("\nDemonstrating how to handle the exception...");
        try {
            System.out.println("Attempting to access character at index " + index + " within a try-catch block...");
            System.out.println("Character is: " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught the StringIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.next();
        
        System.out.println("Enter an index to access:");
        int index = scanner.nextInt();
        
        // This will generate a runtime exception if the index is out of bounds
        // and the program will terminate here.
        generateException(inputString, index);

        // This part of the code will not be reached if the above call fails.
        // To see the exception being handled, you would need to comment out the line above.
        handleException(inputString, index);
        
        scanner.close();
    }
}