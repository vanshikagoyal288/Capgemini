package LinkedList;

class StudentNode {
    int rollNo, age;
    String name, grade;
    StudentNode next;

    StudentNode(int r, String n, int a, String g) {
        rollNo = r;
        name = n;
        age = a;
        grade = g;
        next = null;
    }
}

class StudentList {
    StudentNode head;

    void addStudent(int r, String n, int a, String g) {
        StudentNode node = new StudentNode(r, n, a, g);
        if (head == null) {
            head = node;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    void deleteStudent(int roll) {
        if (head == null) return;

        if (head.rollNo == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}

public class Student_Record_Management {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.addStudent(1, "Rupika", 20, "A");
        list.addStudent(2, "Bhavika", 21, "B");
        list.addStudent(3, "Anchal", 19, "C");

        list.updateGrade(3, "A");
        list.deleteStudent(2);

        list.display();
    }
}
