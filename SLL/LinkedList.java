public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (newNode == null) 
            return false;
        
        // check if the list is empty
        if (head == null) {
            head = newNode;
            return true;
        }
        // insert node at the end of the list
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        // last is referring to last node in the list
        last.setNext(newNode);
        return true;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public boolean insert(int data, int position) {
        if (position <= 0) {
            return false;
        }
        Node newNode = new Node(data);
        if (newNode == null) 
            return false;
        
        if (position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }
        // position is other than 1
        // 1. Locate node at pos - 1 i.e. prev
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev == null) {
                return false;
            }
        }
        // 2 newNode.setNext(prev.getNext());
        // 3
        prev.setNext(newNode);
        return true;
    }

    boolean deleteByPosition(int position) {
        if (head == null || position <= 0) {
            return false;
        }
        if (position == 1) {
            head = head.getNext();
            return true;
        }
        // if pos > 1
        Node prev = head;
        for (int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if (prev == null) {
                return false;
            }
        }
        Node del = prev.getNext();
        if (del == null) {
            return false;
        }
        prev.setNext(del.getNext());
        return true;
    }

    boolean deleteByVal(int data) {
        if (head == null) {
            return false;
        }
        if (head.getData() == data) {
            head = head.getNext();
            return true;
        }
        Node prev = head, del = head;
        while (del.getData() != data) {
            prev = del;
            del = del.getNext();
            if (del == null) {
                return false;
            }
        }
        prev.setNext(del.getNext());
        return true;
    }

    void displayRev() {
        Node temp = head;
        Node[] stack = new Node[100];
        int top = -1;
        while (temp != null) {
            stack[++top] = temp;
            temp = temp.getNext();
        }
        while (top != -1) {
            System.out.print(stack[top--] + " ");
        }
        System.out.println();
    }

    void displayRev(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        displayRev(node.getNext());
        System.out.print(node.getData() + " ");
    }

    void reverse() {
        if (head == null || head.getNext() == null) {
            return;
        }
        Node n1 = head, n2 = head.getNext();
        Node n3;
        while (n2 != null) {
            n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }
        head.setNext(null);
        head = n1;
    }

    Node getHead() {
        return head;
    }
}
