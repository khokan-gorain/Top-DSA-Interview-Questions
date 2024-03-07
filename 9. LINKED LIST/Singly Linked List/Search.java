public class Search {

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

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            Node temp = head;
            newNode.next = head;
            head = newNode;
        }
    }


    // public static void searchNode(int data){
    //     if(head == null){
    //         System.out.println("List is empty...");
    //         return;
    //     } else {
    //         Node temp = head;
    //         Boolean status = false;
    //         while(temp != null){
    //             if(temp.data == data){
    //                 status = true;
    //                 System.out.println("Item is found "+data);
    //                 return;
    //             }
    //             temp = temp.next;
    //         }

    //         if(status == false){
    //             System.out.println("Item not found!...\2");
    //             return;
    //         }
    //     }
    // }

    public static void searchNode(Node head, int key){
        if(head.next == null){
            System.out.println("Key is not found!...\2");
            return;
        }
        if(head == null){
            System.out.println("List is empty...\2");
            return;
        } 
        if(head.data == key){
            System.out.println("Key is found...");
            return;
        }
        searchNode(head.next, key);
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
        
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);

        printNode();

        searchNode(head,2);

    }
    
}
