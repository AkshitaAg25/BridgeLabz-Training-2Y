public class EBook extends Book {

    public EBook() {
        super();
    }

    public void displayDetails() {
        // Accessing public member ISBN
        System.out.println("ISBN: " + ISBN);
        // Accessing protected member title
        System.out.println("Title: " + title);
        // Accessing private member author via public getter
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        EBook ebook = new EBook();

        System.out.print("Enter ISBN: ");
        ebook.ISBN = scanner.nextLine();

        System.out.print("Enter title: ");
        ebook.title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        ebook.setAuthor(author);

        System.out.println("\nEBook Details:");
        ebook.displayDetails();

        scanner.close();
    }
}
