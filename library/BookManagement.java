package library;

import java.util.ArrayList;
import java.util.HashMap;

public class BookManagement {

    ArrayList<Book> checkedOutBooks;
    HashMap<String, Book> catalog;

    BookManagement() {
        this.checkedOutBooks = new ArrayList<>();
        this.catalog = new HashMap<>();
    }

    public void addToCatalog(String bookName, String author) {
        Book book = new Book(bookName, author);
        catalog.put(bookName, book);

    }

    public void displayCatalog() {
        System.out.println("Catalog");
        for (Book book : catalog.values()) {
            System.out.println("Book name : " + book.getName() + " written by : " + book.getAuthor() + " is : " +
                    (book.isAvailable() ? "Available" : " CheckedOut"));
        }
    }

    public void checkOut(String bookName) {
        Book book = catalog.get(bookName);

        if (book != null && book.isAvailable()) {
            checkedOutBooks.add(book);
            book.setAvailable(false);
            System.out.println("Here is your book " + bookName);

        } else {
            System.out.println("Book is Not Available");

        }
    }


    public void bookAvailability(String bookName) {
        Book book = catalog.get(bookName);

        if ( book!=null && book.isAvailable()) {
            System.out.println("Book is Available");
        } else {
            System.out.println("Book is Not available");
        }
    }

    public void returnBook(String bookName) {
        Book book = catalog.get(bookName);

        if (book!= null && checkedOutBooks.contains(book) && !book.isAvailable()) {
            book.setAvailable(true);
            checkedOutBooks.remove(book);
            System.out.println("You have returned " + bookName);

        } else {
            System.out.println("Invalid return");

        }
    }

}
