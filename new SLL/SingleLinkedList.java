import java.util.ArrayList;
import java.util.Stack;


public class SingleLinkedList {
     private Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    public void add(int data, int position) {
        if (position < 0) {
            return;
        }
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node currentNode = this.head;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void removeAll(int data) {
        Node currentNode = this.head;
        Node previousNode = null;
        while (currentNode != null) {
            if (currentNode.data == data) {
                if (previousNode == null) {
                    this.head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public int sum() {
        Node currentNode = this.head;
        int sum = 0;
        while (currentNode != null) {
            sum += currentNode.data;
            currentNode = currentNode.next;
        }
        return sum;
    }

    public void printReverse() {
        Node currentNode = this.head;
        Stack<Integer> stack = new Stack<>();
        while (currentNode != null) {
            stack.push(currentNode.data);
            currentNode = currentNode.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
    public void getPairsSum(int target) {
        Node current = head;
        Node current1 = head;
        while (current != null) {
            while (current1 != null) {
                if (current.data + current1.data == target) {
                    System.out.println(current.data + " " + current1.data);
                }
                current1 = current1.next;
            }
            current = current.next;
            current1 = head;
        }
    }
}

// create SLL with function getPairsSum(int target) which return all pars which sum is=target