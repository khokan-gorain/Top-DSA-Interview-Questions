public class MirrorOfBST {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node mirrorOfBST(Node root){
        if(root == null){ // base case
            return null;
        }

        Node leftMirror = mirrorOfBST(root.left);
        Node rightMirrir = mirrorOfBST(root.right);

        root.left = rightMirrir;
        root.right = leftMirror;

        return root;
    }

    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        System.out.println(mirrorOfBST(root).data);
    }
}
