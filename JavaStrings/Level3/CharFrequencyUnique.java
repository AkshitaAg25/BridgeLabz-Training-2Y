import java.util.Scanner;

public class CharFrequencyUnique {

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique += c;
            }
        }
        return unique.toCharArray();
    }

    // Method to find frequency of characters using unique chars
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII size
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    // Display result in tabular format
    public static void display(String[][] arr) {
        System.out.println("Character   Frequency");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("   %s           %s%n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        display(result);

        sc.close();
    }
}
