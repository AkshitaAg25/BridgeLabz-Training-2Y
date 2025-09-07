import java.util.Scanner;

public class StringLength {
    
    // Method to calculate string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Keep accessing characters
                count++;           // Increment count until exception occurs
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception means we've reached the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Using our custom method
        int customLength = findLength(input);

        // Using built-in length() method for verification
        int builtInLength = input.length();

        // Displaying results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
