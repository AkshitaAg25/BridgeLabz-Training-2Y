import java.util.Scanner;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent() {
        super();
    }

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        // Accessing public member rollNumber
        System.out.println("Roll Number: " + rollNumber);
        // Accessing protected member name
        System.out.println("Name: " + name);
        // Accessing private member CGPA via public getter
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PostgraduateStudent pgStudent = new PostgraduateStudent();

        System.out.print("Enter roll number: ");
        pgStudent.rollNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        pgStudent.name = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        pgStudent.setCGPA(cgpa);

        System.out.println("\nStudent Details:");
        pgStudent.displayDetails();

        scanner.close();
    }
}
