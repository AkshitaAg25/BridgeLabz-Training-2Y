import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemonstration {

    public static void generateException(String[] names, int index) {
        System.out.println("Attempting to access element at index " + index + "...");
        System.out.println("Name at index " + index + " is: " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        System.out.println("\nDemonstrating how to handle the exception...");
        try {
            System.out.println("Attempting to access element at index " + index + " within a try-catch block...");
            System.out.println("Name at index " + index + " is: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught the ArrayIndexOutOfBoundsException!");
            System.out.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException.");
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names to store:");
        int arraySize = scanner.nextInt();
        String[] names = new String[arraySize];
        System.out.println("Enter " + arraySize + " names:");
        for (int i = 0; i < arraySize; i++) {
            names[i] = scanner.next();
        }

        System.out.println("Enter an index to access (e.g., a number larger than " + (arraySize - 1) + "):");
        int index = scanner.nextInt();
        
        // This will generate a runtime exception if the index is out of bounds
        // and the program will terminate here.
        generateException(names, index);

        // This part of the code will not be reached if the above call fails.
        // To see the exception being handled, you would need to comment out the line above.
        handleException(names, index);

        scanner.close();
    }
}