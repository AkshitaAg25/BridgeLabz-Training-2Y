import java.util.Scanner;

public class ModifyDigitAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        long tempNumber = number;

        if (tempNumber == 0) {
            digits[0] = 0;
            index = 1;
        } else {
            while (tempNumber != 0) {
                if (index == maxDigits) {
                    maxDigits *= 2;
                    int[] tempDigits = new int[maxDigits];
                    for (int i = 0; i < digits.length; i++) {
                        tempDigits[i] = digits[i];
                    }
                    digits = tempDigits;
                }
                digits[index] = (int) (tempNumber % 10);
                tempNumber /= 10;
                index++;
            }
        }
        
        if (index == 0) {
            System.out.println("No digits to analyze.");
        } else {
            int largest = -1;
            int secondLargest = -1;

            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }

            if (largest != -1) {
                System.out.println("The largest digit is: " + largest);
            }
            if (secondLargest != -1) {
                System.out.println("The second largest digit is: " + secondLargest);
            } else {
                System.out.println("There is no second largest digit.");
            }
        }

        scanner.close();
    }
}
