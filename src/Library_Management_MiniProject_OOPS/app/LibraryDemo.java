package Library_Management_MiniProject_OOPS.app;

import Library_Management_MiniProject_OOPS.entities.Book;
import Library_Management_MiniProject_OOPS.services.Library;

public class LibraryDemo {

        public static void main(String[] args) {
            Library lib = new Library();
            Book b1 = lib.addBook("Java Programming", "Herbert Schildt");
            Book b2 = lib.addBook("Spring in Action", "Craig Walls");
            System.out.println("Books in library:");
            for (Book b : lib.listBooks()) System.out.println(b);

            Book found = Library.SearchHelper.findByTitle(lib.listBooks(), "Spring in Action");
            System.out.println("Found: " + found);

            lib.removeBook(b1.getId());
            System.out.println("After removal:");
            for (Book b : lib.listBooks()) System.out.println(b);
        }
}