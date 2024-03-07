public class Palindrome1 {

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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Boolean isPalindrome(){
        if(head == null || head.next ==null){
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome1 palindrome1 = new Palindrome1();

        addFirstNode(1);
        addFirstNode(2);
        addFirstNode(3);
        addFirstNode(4);
        addFirstNode(1);

        printNode();
        System.out.println(palindrome1.isPalindrome());
    }
}
