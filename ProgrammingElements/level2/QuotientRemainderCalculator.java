package ProgrammingElements.level2;

import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number (dividend):");
        int number1 = input.nextInt();

        System.out.println("Enter the second number (divisor):");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d%n", quotient, remainder, number1, number2);

        input.close();
    }
}
