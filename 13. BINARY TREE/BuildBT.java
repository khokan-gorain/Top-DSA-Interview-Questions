public class BuildBT {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static class BinaryTree{

        static int idx = -1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }
    }

    public static void preorderTreversal(Node root){

        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTreversal(root.left);
        preorderTreversal(root.right);
    }

    public static void inorderTreversal(Node root){
        if(root == null){ // base case
            return;
        }
        inorderTreversal(root.left);
        System.out.print(root.data+" ");
        inorderTreversal(root.right);

    }

    public static void postorderTreversal(Node root){
        if(root == null){ // base case
            return;
        }

        postorderTreversal(root.left);
        postorderTreversal(root.right);
        System.out.print(root.data+" ");
    }



    public static void main(String[] args) {
        
     int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryTree tree = new BinaryTree();
     Node root = tree.buildTree(node);

     System.out.println(root.data);
     System.out.println();
     preorderTreversal(root);
     System.out.println();
     inorderTreversal(root);
     System.out.println();
     postorderTreversal(root);

    }
}
