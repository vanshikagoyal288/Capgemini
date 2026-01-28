package LinkedList;
class TaskNode {
    int id, priority;
    String name;
    TaskNode next;

    TaskNode(int i, String n, int p) {
        id = i;
        name = n;
        priority = p;
    }
}

class TaskScheduler {
    TaskNode head;

    void addTask(int i, String n, int p) {
        TaskNode node = new TaskNode(i, n, p);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}

public class Task_Scheduler {
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Coding", 1);
        ts.addTask(2, "Testing", 2);
        ts.displayTasks();
    }
}
