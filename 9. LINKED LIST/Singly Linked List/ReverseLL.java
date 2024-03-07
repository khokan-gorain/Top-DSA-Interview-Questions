public class ReverseLL {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data  = data;
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

    public static void reverseNode(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        addLast(5);
        addLast(4);
        addLast(3);
        addLast(2);
        addLast(1);

        printNode();

        reverseNode();
        printNode();
    }
    
}
