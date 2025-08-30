import java.util.Scanner;

public class NumberReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int digitCount = 0;
        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                digitCount++;
            }
        }

        int[] originalDigits = new int[digitCount];
        tempNumber = number;
        int index = 0;

        if (tempNumber == 0) {
            originalDigits[0] = 0;
        } else {
            while (tempNumber != 0) {
                originalDigits[index] = tempNumber % 10;
                tempNumber /= 10;
                index++;
            }
        }

        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = originalDigits[digitCount - 1 - i];
        }

        System.out.println("The digits in reverse order are:");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
