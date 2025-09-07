import java.util.Scanner;

public class StringCharacters {

    public static char[] getChars(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.next();

        char[] customArray = getChars(inputString);
        char[] builtInArray = inputString.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        System.out.println("Result of comparison with built-in toCharArray(): " + areEqual);
        
        scanner.close();
    }
}