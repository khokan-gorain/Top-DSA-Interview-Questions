
public class AddLast {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printNode(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        } else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

   
    public static void main(String[] args) {
        AddLast ll= new AddLast();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        //ll.addMiddle(10, 3);
        ll.printNode();
    }
    
}
