public class NullPointerDemonstration {

    public static void generateNullPointerException() {
        System.out.println("Attempting to generate a NullPointerException...");
        String text = null;
        System.out.println("The length of the string is: " + text.length());
    }

    public static void handleNullPointerException() {
        System.out.println("\nDemonstrating how to handle a NullPointerException...");
        String text = null;
        try {
            System.out.println("Attempting to access a method on a null string...");
            System.out.println("The length of the string is: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught the NullPointerException! The program will continue.");
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // First, we call the method that will generate the exception.
        // The program will terminate here.
        generateNullPointerException();

        // The following line will not be reached because the program crashes above.
        // To run the second method, you would need to comment out the first call.
        // handleNullPointerException();

        // To run the program as requested, let's "refactor" by commenting the first part.
        // Uncomment the line below to see how the exception is handled.
        // handleNullPointerException();
    }
}