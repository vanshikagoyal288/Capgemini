package LinkedList;
class ProcessNode {
    int pid, burstTime;
    ProcessNode next;

    ProcessNode(int p, int b) {
        pid = p;
        burstTime = b;
    }
}

class RoundRobin {
    ProcessNode head;

    void addProcess(int pid, int bt) {
        ProcessNode node = new ProcessNode(pid, bt);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    void simulate(int quantum) {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            if (temp.burstTime > 0) {
                System.out.println("Executing Process " + temp.pid);
                temp.burstTime -= quantum;
                if (temp.burstTime < 0)
                    temp.burstTime = 0;
            }
            temp = temp.next;
        } while (temp != head);
    }
}


public class Round_Robin_Scheduling {
    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 10);
        rr.addProcess(2, 5);

        rr.simulate(3);
    }
}
