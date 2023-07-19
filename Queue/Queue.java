package Queue;

public class Queue {
    private int[] arr;
    private int front, rear;
    private int size;

    public Queue(int size) {
        this.size = size;
        this.arr = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1) || (front > rear);
    }

    public boolean isFull() {
        return rear == (size - 1);
    }

    public boolean insert(int data) {
        if (isFull()) {
            return false;
        }
        arr[++rear] = data;
        if (front == -1) {
            front = 0;
        }
        // bulk move operation
        /*
         * if(rear == size - 1 && front > 0 ) {
         * //code to shift the data to the front of the queue
         * }
         */
        return true;
    }

    public int delete() {
        if (isEmpty()) {
            return -999;
        }
        return arr[front++];
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
