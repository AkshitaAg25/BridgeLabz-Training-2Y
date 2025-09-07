import java.util.Scanner;

public class StringCaseConverte {

    public static String convertToLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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

        String customLower = convertToLowerCase(originalString);
        System.out.println("Lowercase from custom method: " + customLower);

        String builtInLower = originalString.toLowerCase();
        System.out.println("Lowercase from built-in method: " + builtInLower);

        boolean areEqual = compareStrings(customLower, builtInLower);
        System.out.println("Are the results equal? " + areEqual);

        scanner.close();
    }
}
