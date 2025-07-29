package OOPS.BookCatlog;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Manager {
    ArrayList<Book> books;

    public Manager() {
        books = new ArrayList<>();
    }

    public void addBook(String name, String author, String publisher, int publishYear, Book.Category category, int price, int count) {
        Book book = new Book(name, author, publisher, publishYear, category, price, count);
        books.add(book);
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            book.display();
        }
    }

    public void searchBook(String name) {
        boolean found = false;
        for (Book book : books) {
            if (Objects.equals(book.getName(), name)) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void update(String name) {
        for (Book book : books) {
            if (Objects.equals(book.getName(), name)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Update Price");
                System.out.println("2. Update Count");
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        System.out.print("Enter new price: ");
                        int newPrice = sc.nextInt();
                        book.setPrice(newPrice);
                        System.out.println("Price updated successfully!");
                        break;
                    case 2:
                        System.out.print("Enter new count: ");
                        int newCount = sc.nextInt();
                        book.setCount(newCount);
                        System.out.println("Count updated successfully!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                return;
            }
        }
        System.out.println("Book not found to update.");
    }

    public void deleteBook(String name) {
        Book toDelete = null;
        for (Book book : books) {
            if (Objects.equals(book.getName(), name)) {
                toDelete = book;
                break;
            }
        }
        if (toDelete != null) {
            books.remove(toDelete);
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found to delete.");
        }
    }
}
