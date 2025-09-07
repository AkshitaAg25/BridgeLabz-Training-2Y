import java.util.Scanner;

public class StringComparison {

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.next();

        System.out.println("Enter the second string:");
        String secondString = scanner.next();

        // Compare using the custom method
        boolean customResult = compareStrings(firstString, secondString);
        System.out.println("Result from custom method: " + customResult);

        // Compare using the built-in method
        boolean builtInResult = firstString.equals(secondString);
        System.out.println("Result from built-in equals() method: " + builtInResult);

        // Check if the results are the same
        if (customResult == builtInResult) {
            System.out.println("The results from both methods are the same.");
        } else {
            System.out.println("The results from both methods are different.");
        }

        scanner.close();
    }
}