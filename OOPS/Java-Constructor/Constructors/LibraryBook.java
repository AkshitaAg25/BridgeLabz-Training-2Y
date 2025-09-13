import java.util.Scanner;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book: " + title + " is not available.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        System.out.print("Is the book available? (true/false): ");
        boolean availability = scanner.nextBoolean();

        LibraryBook book = new LibraryBook(title, author, price, availability);

        book.borrowBook();

        scanner.close();
    }
}
