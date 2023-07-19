package Queue;

public class Main {
    public static void main(String[] args) {
        Queue cq = new Queue(5);
        System.out.println("ins : " + cq.insert(10));
        System.out.println("ins : " + cq.insert(20));
        System.out.println("ins : " + cq.insert(30));
        System.out.println("ins : " + cq.insert(40));
        System.out.println("ins : " + cq.insert(50));
        System.out.println("ins : " + cq.insert(60));
        System.out.println("del : " + cq.delete());
        System.out.println("ins : " + cq.insert(60));
        System.out.println("del : " + cq.delete());
        System.out.println("ins : " + cq.insert(70));
        /*
         * Queue q = new Queue(5);
         * System.out.println("Ins: " + q.insert(10) ); System.out.println("Ins: " +
         * q.insert(20) ); System.out.println("Ins: " + q.insert(30) );
         * System.out.println("Del : " + q.delete()); System.out.println("Del : " +
         * q.delete()); System.out.println("Del : " + q.delete());
         * System.out.println("Del : " + q.delete());System.out.println("is Empty : " +
         * q.isEmpty() +" is Full : " + q.isFull());
         * System.out.println("Ins: " + q.insert(40) ); System.out.println("Ins: " +
         * q.insert(50) ); System.out.println("Ins: " + q.insert(60) );
         * System.out.println("Del : " + q.delete()); System.out.println("Del : " +
         * q.delete()); System.out.println("Del : " + q.delete());
         * System.out.println("is Empty : " + q.isEmpty() +" is Full : " + q.isFull());
         */
    }
}
