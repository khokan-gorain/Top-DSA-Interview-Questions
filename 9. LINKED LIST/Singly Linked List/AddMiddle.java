public class AddMiddle {
    
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addMiddle(int data, int position_data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            Node temp = head;       
            while(temp != null){
                if(temp.data == position_data){
                    System.out.println("Yes");
                    Node dumyNode = temp.next;
                    temp.next = newNode;
                   newNode.next = dumyNode;
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
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        
        AddMiddle am = new AddMiddle();
        am.addMiddle(1, 0);
        am.addMiddle(2, 1);
        //AddMiddle.addMiddle(3, 2);
        am.printNode();
    }

}
