
public class SearchBST {
    
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static boolean searchBST(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        } else if(root.data > key){
           return searchBST(root.left, key);
        } else {
            return searchBST(root.right, key);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(searchBST(root, 3));
    }
}
