package Assignment_4.Question_One;

public class Library {
    
    String title;
    int bookID;
    static int increment = 0;

    {
        bookID = ++increment;
    }

    public Library(String title) {
        this.title = title;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Library book1 = new Library("Your Path to Computer Science ");
        Library book2 = new Library("Life Aspects");

        System.out.println(">>>>>>>>> book One <<<<<<<<<");
        System.out.println("The book title is  " + book1.title + " " + "And the book ID is " + book1.bookID);
        System.out.println(">>>>>>>>> book Two <<<<<<<<<");
        System.out.println("The book title is  " + book2.title + " And the book ID is " + book2.bookID);
    }

}
