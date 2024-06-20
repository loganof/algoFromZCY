import MyStack.MyStack1;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        MyStack1 mystack1 = new MyStack1();
        mystack1.push(3);
        mystack1.push(8);
        mystack1.push(-1);
        mystack1.push(2);
        System.out.println(mystack1.getmin());
        mystack1.pop();
        System.out.println(mystack1.getmin());

    }
}