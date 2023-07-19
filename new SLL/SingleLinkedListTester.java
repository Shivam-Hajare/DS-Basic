public class SingleLinkedListTester {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1, 0);
        list.add(2, 1);
        list.add(3, 2);
        list.add(4, 3);
        list.add(5, 4);
        list.printReverse();
       int sum= list.sum();
       System.out.println("sum is:"+sum);
      list.getPairsSum(5);

    }
}