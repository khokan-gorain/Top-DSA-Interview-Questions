public class KthLevelDataPrint {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthLevel(Node root, int kLevel, int k){
        if(root == null){ // base case
            return;
        }
        if(kLevel == k){
            System.out.print(root.data+" ");
            return; // no need to traverse child node
        }

        kthLevel(root.left, kLevel+1, k);
        kthLevel(root.right, kLevel+1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthLevel(root, 1, 3);
    }
}
