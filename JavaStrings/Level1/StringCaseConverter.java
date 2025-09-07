import java.util.Scanner;

public class StringCaseConverter {

    public static String convertToUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
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
        String originalString = scanner.nextLine();

        String customUpper = convertToUpperCase(originalString);
        System.out.println("Uppercase from custom method: " + customUpper);

        String builtInUpper = originalString.toUpperCase();
        System.out.println("Uppercase from built-in method: " + builtInUpper);

        boolean areEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Are the results equal? " + areEqual);

        scanner.close();
    }
}