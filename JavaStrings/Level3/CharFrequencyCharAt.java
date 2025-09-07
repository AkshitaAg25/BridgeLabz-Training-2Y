import java.util.Scanner;

public class CharFrequencyCharAt {

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as processed
            }
        }

        // Fill result array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] < 0) { // unprocessed unique char
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(-freq[c]);
                freq[c] = 0; // mark as done
                index++;
            }
        }
        return result;
    }

    // Display result
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
