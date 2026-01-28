package LinkedList;
class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

class MovieList {
    MovieNode head, tail;

    void addMovie(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void updateRating(String title, double r) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = r;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }
}

public class Movie_Management_System {
    public static void main(String[] args) {
        MovieList list = new MovieList();

        list.addMovie("Inception", "Nolan", 2010, 8.8);
        list.addMovie("Interstellar", "Nolan", 2014, 9.0);

        list.updateRating("Inception", 9.1);
        list.displayForward();
        list.displayReverse();
    }
}
