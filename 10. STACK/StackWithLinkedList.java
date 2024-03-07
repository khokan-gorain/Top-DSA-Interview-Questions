import java.util.LinkedList;
public class StackWithLinkedList {
    
      static class Node {
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

    static class Stack {
        LinkedList<Integer> list = new LinkedList<Integer>();

        public static Node head = null;
        public boolean isEmpty(){
             return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(head == null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(head == null){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
        }
    }
}
