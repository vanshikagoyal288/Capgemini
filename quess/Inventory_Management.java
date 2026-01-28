package LinkedList;
class ItemNode {
    int id, qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int i, String n, int q, double p) {
        id = i;
        name = n;
        qty = q;
        price = p;
    }
}

class Inventory {
    ItemNode head;

    void addItem(int i, String n, int q, double p) {
        ItemNode node = new ItemNode(i, n, q, p);
        node.next = head;
        head = node;
    }

    double totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}

public class Inventory_Management {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem(1, "Laptop", 2, 50000);
        inv.addItem(2, "Mouse", 5, 500);

        System.out.println("Total Value: " + inv.totalValue());
    }
}
