import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();

        Person original = new Person(name, age);
        System.out.println("Original Person: Name - " + original.name + ", Age - " + original.age);

        Person copy = new Person(original);
        System.out.println("Copied Person: Name - " + copy.name + ", Age - " + copy.age);

        scanner.close();
    }
}
