public class RemoveFMLNode {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public static Node head;
    public static Node tail;

    public static void removeFirstNode(){
        if(head == null){
            System.out.println("List is allready empty...");
            return;
        } else {
            Node temp = head;
            int data = temp.data;
            head = temp.next;
            System.out.println("Delete Node is "+data);
            return;
        }
    }

    public static void removeLastNode(){
        if(head == null){
            System.out.println("List is allready empty...");
            return;
        } else {
             Node temp = head;
             Node demo = null;
             int nodeData = 0;
            while(temp.next != null){
                 demo = temp;
                 nodeData = demo.next.data;
                 temp = temp.next;
            }
            System.out.println("Delete item is "+nodeData);
            demo.next = null;
            
        }
    }

    public static void removeMiddle(int nodePosition){
        if(head == null){
            System.out.println("List is all Ready Empty...");
            return;
        } else {
            Node temp = head;
            Node demo = null;
            int nodeData;
            while(temp != null){
                if(temp.data == nodePosition){
                    nodeData = temp.data;
                    Node deleteNode = temp.next;
                    demo.next = deleteNode;
                    System.out.println("Delete Node is: "+nodeData);
                } 
                   demo = temp;
                    temp = temp.next;
                
            }

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
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        RemoveFMLNode remove = new RemoveFMLNode();
        remove.addFirst(5);
        remove.addFirst(4);
        remove.addFirst(3);
        remove.addFirst(2);
        remove.addFirst(1);

          remove.removeFirstNode();
          remove.removeLastNode();
          remove.removeMiddle(3);

        remove.printNode();
    }
}
