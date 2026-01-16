package level 1;

public class _5_Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("You have returned \"" + title + "\".");
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.0);

        b1.borrowBook();
        b1.borrowBook(); // Trying to borrow again
        b1.returnBook();
        b1.borrowBook(); // Borrowing after return
    }
}