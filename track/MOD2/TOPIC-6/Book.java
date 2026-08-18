import java.util.Scanner;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        String name = scanner.nextLine();
        String author = scanner.nextLine();
        // Create one Book object
        Book b = new Book(name, author);
        // Call display()
        b.display();
        scanner.close();
    }
}
