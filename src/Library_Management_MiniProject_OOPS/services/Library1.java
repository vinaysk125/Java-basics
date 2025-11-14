package Library_Management_MiniProject_OOPS.services;

import Library_Management_MiniProject_OOPS.entities.Book;
import java.util.ArrayList;
import java.util.List;

public class Library1 {

    private static int bookCounter = 0;       // static counter shared by all libraries
    public static final int MAX_BOOKS = 100;  // final constant, max allowed books

    private List<Book> books = new ArrayList<>(); // list of books in this library

    // add a new book to the library
    public Book addBook(String title, String author) {
        if (books.size() >= MAX_BOOKS) {
            System.out.println("Library full, cannot add more books.");
            return null;
        }
        Book b = new Book(++bookCounter, title, author); // create new book with unique ID
        books.add(b); // add to list
        return b; // return the newly added book
    }

    public boolean removeBook(int bookId) {
        return books.removeIf(b -> b.getId() == bookId);
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books); // return copy
    }

    public static class SearchHelper {
        public static Book findByTitle(List<Book> books, String title) {
            for (Book b : books) if (b.getTitle().equalsIgnoreCase(title)) return b;
            return null;
        }
    }
}