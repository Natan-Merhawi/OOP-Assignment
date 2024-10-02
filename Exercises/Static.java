package Exercises;
class Book {
    // Static variable
    static int totalBooks = 0;

    // Instance variables
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++; // Incrementing static variable whenever a new book is created
    }

    // Static method to get the total number of books
    static int getTotalBooks() {
        return totalBooks;
    }

    // Instance method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Static {
    public static void main(String[] args) {
        // Creating instances of Book
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Accessing instance variables and methods
        book1.displayBookDetails(); // Output: Title: 1984, Author: George Orwell
        book2.displayBookDetails(); // Output: Title: To Kill a Mockingbird, Author: Harper Lee

        // Accessing static variable
        System.out.println("Total Books: " + Book.getTotalBooks()); // Output: Total Books: 2
    }
}