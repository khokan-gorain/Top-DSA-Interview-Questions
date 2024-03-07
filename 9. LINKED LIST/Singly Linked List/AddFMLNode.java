public class AddFMLNode {
    
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

    public static void addFirstNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addLastNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

   
    public static void addMiddleNode(int data, int positionNode){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            Node temp = head;
            while(temp != null){
                if(temp.data == positionNode){
                    Node demo = temp.next;
                    temp.next = newNode;
                    newNode.next = demo;
                }
                temp = temp.next;
            }
        }
    }

    public static void printNode(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty...");
            return;
        } else {
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        AddFMLNode ll = new AddFMLNode();
        ll.addFirstNode(2);
        ll.addFirstNode(1);
        ll.addFirstNode(0);

        ll.addLastNode(10);
        ll.addLastNode(20);
        ll.addLastNode(30);

        ll.addMiddleNode(5, 10);

        ll.printNode();
    }
}
