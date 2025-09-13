import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book defaultBook = new Book();
        System.out.println("Default Book: Title - " + defaultBook.title + ", Author - " + defaultBook.author + ", Price - " + defaultBook.price);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();

        Book paramBook = new Book(title, author, price);
        System.out.println("Parameterized Book: Title - " + paramBook.title + ", Author - " + paramBook.author + ", Price - " + paramBook.price);

        scanner.close();
    }
}
