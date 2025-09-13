import java.util.Scanner;

public class Course {
    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String name = scanner.nextLine();

        System.out.print("Enter duration in hours: ");
        int duration = scanner.nextInt();

        System.out.print("Enter fee: ");
        double fee = scanner.nextDouble();

        Course course = new Course(name, duration, fee);

        course.displayCourseDetails();

        scanner.nextLine(); // consume newline
        System.out.print("Enter new institute name: ");
        String newInstitute = scanner.nextLine();
        Course.updateInstituteName(newInstitute);

        System.out.println("After update:");
        course.displayCourseDetails();

        scanner.close();
    }
}
