import java.util.Scanner;

public class AllOperationLL {
    
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
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addMiddleNode(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            Node temp = head;
            while(temp != null){
                if(temp.data == position){
                    Node next = temp.next;
                    temp.next = newNode;
                    newNode.next = next;
                }
                temp = temp.next;
           }
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


    public static void removeFirstNode(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        } else {
            head = head.next;
        }
    }

    public static void removeMiddleNode(int data){
        if(head == null){
            System.out.println("List is empty...");
            return;
        } else {
            Node temp = head;
            Node demo = null;
            while(temp != null){
                if(temp.data == data){
                    Node next = temp.next;
                    demo.next = next;
                }
                demo = temp;
                temp = temp.next;
            }
        }
    }

    public static void removeLastNode(){
        if(head == null){
            System.out.println("List is empty...");
            return;
        } else {
            Node temp = head;
            Node demo = null;
            while(temp.next != null){
                 demo = temp;
                 temp = temp.next;
            }
            demo.next = null;
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

    public static int inputData(){
            Scanner sc = new Scanner(System.in);
            int data;
            System.out.println("Enter Number: ");
            data = sc.nextInt();
            return data;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
             int choice;
        int data;
        System.out.println("1. Add First Node");
        System.out.println("2. Add Middle Node");
        System.out.println("3. Add Last Node");

        System.out.println("4. Remove First Node");
        System.out.println("5. Remove Middle Node");
        System.out.println("6. Remove Last Node");

        System.out.println("Enter Your Choice: ");
        choice = sc.nextInt();

        
       
        switch(choice){

            case 1: 
            data = inputData();
            addFirstNode(data);
            printNode();
            System.out.println("---------------------------------");
            break;

            case 2:
            data = inputData();
            int position;
            System.out.println("Enter Position:");
            position = sc.nextInt();
            addMiddleNode(data, position);
            printNode();
            System.out.println("---------------------------------");
            break;

            case 3:
            data = inputData();
            addLastNode(data);
            printNode();
            System.out.println("---------------------------------");
            break;

            case 4:
            removeFirstNode();
            printNode();
            System.out.println("---------------------------------");
            break;

            case 5:
            int position1;
            System.out.println("Enter The Position ");
            position1 = sc.nextInt();
            removeMiddleNode(position1);
            printNode();
            System.out.println("---------------------------------");
            break;

            case 6:
            removeLastNode();
            printNode();
            System.out.println("---------------------------------");
            break;

        }
    }
    
    }

}
