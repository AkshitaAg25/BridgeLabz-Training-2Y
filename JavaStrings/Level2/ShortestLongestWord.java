import java.util.Scanner;

public class ShortestLongestWord {
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

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestLongest(String[][] table) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            if (length < Integer.parseInt(table[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (length > Integer.parseInt(table[longestIndex][1])) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] table = wordsWithLengths(words);
        int[] result = findShortestLongest(table);

        System.out.println("Shortest word: " + table[result[0]][0] +
                           " (Length: " + Integer.parseInt(table[result[0]][1]) + ")");
        System.out.println("Longest word: " + table[result[1]][0] +
                           " (Length: " + Integer.parseInt(table[result[1]][1]) + ")");

        sc.close();
    }
}
