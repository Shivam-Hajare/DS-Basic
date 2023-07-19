package DLL;


    public class DoublyLinkedList {
        private Node head;

        public DoublyLinkedList() {
            head = null;
        }

        public boolean insert(int data) {
            Node newNode = new Node(data);
            if (newNode == null) {
                return false;
            }
            // list is empty
            if (head == null) {
                head = newNode;
                return true;
            }
            // list is not empty
            // locate last node
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
            newNode.setPrev(last);
            return true;
        }

        public boolean insert(int data, int position) {
            if (position <= 0) {
                return false;
            }
            Node newNode = new Node(data);
            if (newNode == null) {
                return false;
            }
            if (position == 1) {
                if (head != null) {
                    newNode.setNext(head);
                    head.setPrev(newNode);
                }
                head = newNode;
                return true;
            }
            // position is other than 1
            Node prevNode = head, nextNode = null;
            for (int i = 1; i < position - 1; i++) {
                prevNode = prevNode.getNext();
                if (prevNode == null) {
                    return false;
                }
            }
            nextNode = prevNode.getNext();
            // link the newnode
            newNode.setPrev(prevNode);
            prevNode.setNext(newNode);
            if (nextNode != null) {
                newNode.setNext(nextNode);
                nextNode.setPrev(newNode);
            }
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

        public boolean deleteByPosition(int position) {
            if ((head == null || position <= 0) || (head == null && position > 1)) {
                return false;
            }
            if (position == 1) {
                head = head.getNext();
                if (head != null) {
                    head.setPrev(null);
                }
                return true;
            }
            Node del = head;
            for (int i = 1; i < position; i++) {
                del = del.getNext();
                if (del == null) {
                    return false;
                }
            }
            del.getPrev().setNext(del.getNext());
            if (del.getNext() != null) {
                del.getNext().setPrev(del.getPrev());
            }
            return true;
        }

        public boolean deleteByVal(int data) {
            if (head == null) {
                return false;
            }
            if (head.getData() == data) {
                head = head.getNext();
                if (head != null) {
                    head.setPrev(null);
                }
                return true;
            }
            // data is not present in first node
            // Locate the del node 
            Node del = head;
            while (del.getData() != data) {
                del = del.getNext();
                if (del == null) {
                    return false;
                }
            }
            // del is now referring to the node which is to be deleted
            // del.getPrev().setNext(del.getNext());
            if (del.getNext() != null) {
                del.getNext().setPrev(del.getPrev());
            }
            return true;
        }
    }

