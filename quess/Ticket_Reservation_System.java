package LinkedList;
class TicketNode {
    int ticketId;
    String customer, movie;
    TicketNode next;

    TicketNode(int id, String c, String m) {
        ticketId = id;
        customer = c;
        movie = m;
    }
}

class TicketSystem {
    TicketNode head;

    void bookTicket(int id, String c, String m) {
        TicketNode node = new TicketNode(id, c, m);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customer);
            temp = temp.next;
        } while (temp != head);
    }

    int totalTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class Ticket_Reservation_System {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.bookTicket(1, "Aman", "Avatar");
        ts.bookTicket(2, "Riya", "Titanic");

        ts.displayTickets();
        System.out.println("Total Tickets: " + ts.totalTickets());
    }
}
