import java.util.Scanner;

public class AddFirst {
    
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
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
            newNode.prev = null;
            head = newNode;
        }
    }

    public static void addLastNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            Node temp = head;
            Node demo = null;
            while(temp != null){
                demo = temp;
                temp = temp.next;
            }
            demo.next = newNode;
            newNode.next = null;
        }
    }

    public static void addMiddleNode(int data, int positionData){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = null;
            return;
        } else {
            Node temp = head;
            while(temp != null){
                if(temp.data == positionData){
                    Node next = temp.next;
                    temp.next = newNode;
                    newNode.next = next;
                    next.prev = newNode;
                    newNode.prev = temp;
                }
                temp = temp.next;
            }
        }
    }


    public static void removeFirstNode(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        } 
        int data = head.data;
        head = head.next;
        head.prev = null;
        System.out.println("Remove data is: "+data);
    }

    public static void removeLastNode(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;
        Node demo = null;
        while(temp.next != null){
            demo = temp;
            temp = temp.next; //find last node
        }
        int data = temp.data;
        Node dummy = temp;
        demo.next = null;
        temp.prev = null;
        System.out.println("Delete item is: "+data);
    }

    public static void removeMiddleNode(int position){
        if(head == null){
            System.out.println("List is empty...");
            return;
        }

        Node temp = head;
        Node next;
        Node prev;
        while(temp != null){
            if(temp.data == position){
                int data = temp.data;
                next = temp.next;
                prev = temp.prev;

                prev.next = next;
                next.prev = prev;
                
                System.out.println("Delete item is:"+data);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!...\2");
    }


    public static void printNodeData(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        } else {
            Node temp = head;
            System.out.print("null<=>");
            while(temp != null){
                System.out.print(temp.data+"<=>");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static int inputData(){
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Node Data = ");
        data = sc.nextInt();
        return data;
    }
    
    public static int[] inputDataWithPosition(){
        int data,position;
        Scanner sc = new Scanner(System.in);
        int info[] = new int[2];
        System.out.println("Enter The Node Data = ");
        data = sc.nextInt();
        System.out.println("Enter The Node Position = ");
        position = sc.nextInt();
        info[0] = data;
        info[1] = position;
        return info;
    }
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int choice,data;

     while(true){

        System.out.println("1. Add Firt Node");
        System.out.println("2. Add Middle Node");
        System.out.println("3. Add Last Node");
        System.out.println("4. Remove Firt Node");
        System.out.println("5. Remove Middle Node");
        System.out.println("6. Remove Last Node");
        System.out.println("Enter Your Choice: ");
        choice = sc.nextInt();


        switch(choice){
            case 1:
            data = inputData();
            addFirst(data);
            printNodeData();
            break;

            case 2:
            int info[] = new int[2];
            info = inputDataWithPosition();
            addMiddleNode(info[0], info[1]);
            printNodeData();
            break;

            case 3:
            data = inputData();
            addLastNode(data);
            printNodeData();
            break;

            case 4:
            removeFirstNode();
            printNodeData();
            break;

            case 5:
            data = inputData();
            removeMiddleNode(data);
            printNodeData();
            break;

            case 6:
            removeLastNode();
            printNodeData();
            break;

            default :
            System.out.println("Invalid Choice...");


        }
     }
        
        // addFirst(4);
        // addFirst(3);
        // addFirst(2);
        // addFirst(1);

        //  addLastNode(6);
        //  addLastNode(7);
        //  addMiddleNode(9, 2);
        //  addMiddleNode(12, 6);
         

        // printNodeData();
        // removeFirstNode();
        // printNodeData();

        // removeLastNode();
        // printNodeData();

        // removeMiddleNode(3);
        // printNodeData();
    }
}
