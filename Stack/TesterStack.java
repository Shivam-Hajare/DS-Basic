package Stack;

public class TesterStack {
    public static void main(String[] args) {
        StackLiLi s1=new StackLiLi();//default is 5 but we can pass sizealso
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("peek : "+s1.peek()); s1.push(40);
        s1.push(50);
        s1.display();
        s1.push(60); System.out.println("popped: "+s1.pop()); System.out.println("popped: "+s1.pop()); System.out.println("popped: "+s1.pop()); System.out.println("popped: "+s1.pop()); System.out.println("popped: "+s1.pop()); System.out.println("popped: "+s1.pop()); s1.display();
        }
}
