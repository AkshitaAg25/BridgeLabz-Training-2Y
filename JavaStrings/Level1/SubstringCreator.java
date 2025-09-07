import java.util.Scanner;

public class SubstringCreator {

    public static String createSubstring(String str, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid indices provided.");
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

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

        System.out.println("Enter a string:");
        String originalString = scanner.next();

        System.out.println("Enter the starting index (inclusive):");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the ending index (exclusive):");
        int endIndex = scanner.nextInt();

        String customSubstring = createSubstring(originalString, startIndex, endIndex);
        System.out.println("Substring from custom method: " + customSubstring);

        String builtInSubstring = originalString.substring(startIndex, endIndex);
        System.out.println("Substring from built-in method: " + builtInSubstring);

        boolean areEqual = compareStrings(customSubstring, builtInSubstring);
        System.out.println("Are the substrings equal? " + areEqual);

        scanner.close();
    }
}