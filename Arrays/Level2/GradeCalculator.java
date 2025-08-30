import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // 2D array to store marks for each student in three subjects
        // Column 0: Physics, Column 1: Chemistry, Column 2: Maths
        double[][] marks = new double[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            String[] subjects = {"Physics", "Chemistry", "Maths"};

            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    System.out.print("Enter " + subjects[j] + " marks: ");
                    mark = scanner.nextDouble();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please enter a positive value.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }

            // Calculate percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100.0;
            
            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
        
        scanner.close();
    }
}
