public class ReverseLinkedList {
    
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirstNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
       // newNode.prev = null;
        head = newNode;

    }

    public static void reverseLinkedList(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
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
    public static void printNodeData(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;
        System.out.print("null<=>");
        while(temp != null){
            System.out.print(temp.data+"<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addFirstNode(5);
        addFirstNode(4);
        addFirstNode(3);
        addFirstNode(2);
        addFirstNode(1);

        printNodeData();

        reverseLinkedList();
        printNodeData();
    }
}
