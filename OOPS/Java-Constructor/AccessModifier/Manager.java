import java.util.Scanner;

public class Manager extends Employee {

    public Manager() {
        super();
    }

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        // Accessing public member employeeID
        System.out.println("Employee ID: " + employeeID);
        // Accessing protected member department
        System.out.println("Department: " + department);
        // Accessing private member salary via public getter
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manager manager = new Manager();

        System.out.print("Enter employee ID: ");
        manager.employeeID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter department: ");
        manager.department = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        manager.setSalary(salary);

        System.out.println("\nManager Details:");
        manager.displayDetails();

        scanner.close();
    }
}
