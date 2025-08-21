import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of students (N):");
        int numberOfStudents = input.nextInt();
        
        long totalHandshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
        
        System.out.println("The maximum number of handshakes is " + totalHandshakes);
        
        input.close();
    }
}