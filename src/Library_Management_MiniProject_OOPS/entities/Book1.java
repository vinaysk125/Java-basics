package Library_Management_MiniProject_OOPS.entities;

public class Book1 {
    private final int id;      // unique, immutable ID
    private String title;      // title of the book
    private String author;     // author of the book

    // Contractor assigned for variable
    public Book1(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Setter method to set private values
    public void setTitle (String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Invalid title!");
            return;
        }
        this.title = title;
    }
    public void setAuthor (String author) {
        if (author == null || author.isEmpty()) {
            System.out.println("Invalid title!");
            return;
        }
        this.author = author;
    }

    // Getter method to get private values
    public int getId () {
        return id;
    }
    public String getTitle () {
        return title;
    }
    public String getAuthor () {
        return author;
    }

    // toString() allows us to define a readable string representation:
    // @Override → tells Java we are overriding the default toString() method
    // Returns a concise, human-readable string for the book.
    public String toString (){
        return "[" + id + "] " + title + " by " + author;
    }

}
