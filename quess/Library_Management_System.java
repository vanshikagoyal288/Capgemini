package LinkedList;
class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String t, String a, String g, boolean av) {
        bookId = id;
        title = t;
        author = a;
        genre = g;
        available = av;
    }
}

class Library {
    BookNode head, tail;

    void addBook(int id, String t, String a, String g, boolean av) {
        BookNode node = new BookNode(id, t, a, g, av);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title))
                System.out.println(temp.title + " by " + temp.author);
            temp = temp.next;
        }
    }

    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(1, "Java", "James", "Programming", true);
        lib.addBook(2, "DSA", "Mark", "CS", false);

        lib.displayForward();
        lib.displayReverse();
        System.out.println("Total Books: " + lib.countBooks());
    }
}
