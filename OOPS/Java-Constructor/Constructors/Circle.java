import java.util.Scanner;

public class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle defaultCircle = new Circle();
        System.out.println("Default Circle: Radius - " + defaultCircle.radius);

        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();

        Circle paramCircle = new Circle(radius);
        System.out.println("Parameterized Circle: Radius - " + paramCircle.radius);

        scanner.close();
    }
}
