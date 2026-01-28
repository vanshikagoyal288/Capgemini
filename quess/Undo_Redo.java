package LinkedList;
class TextState {
    String text;
    TextState prev, next;

    TextState(String t) {
        text = t;
    }
}

class TextEditor {
    TextState current;

    void addState(String t) {
        TextState node = new TextState(t);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void show() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
    }
}
public class Undo_Redo {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addState("Hello");
        te.addState("Hello World");
        te.undo();
        te.show();
    }
}
