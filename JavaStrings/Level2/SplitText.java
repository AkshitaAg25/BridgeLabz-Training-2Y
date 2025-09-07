import java.util.Scanner;

public class SplitText {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] splitWords(String str) {
        int n = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[i] = str.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[spaceCount] = str.substring(start, n);
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customSplit = splitWords(input);
        String[] builtInSplit = input.split(" ");

        System.out.println("Custom split:");
        for (String word : customSplit) System.out.println(word);

        System.out.println("Built-in split:");
        for (String word : builtInSplit) System.out.println(word);

        System.out.println("Are both results same? " + compareArrays(customSplit, builtInSplit));
        sc.close();
    }
}
