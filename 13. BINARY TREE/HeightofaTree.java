public class HeightofaTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightOfTree(Node root){
        if(root == null){ // base case
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    public static int countNode(Node root){
        if(root == null){ // base case
            return 0; 
        }

        int leftCount = countNode(root.left);
        int rightCount = countNode(root.right);
        return leftCount + rightCount + 1;
    }

    public static int nodeSum(Node root){
        if(root == null){ // base case
            return 0;
        }
        // this three line of code for every node 
        int leftSum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(heightOfTree(root));
        System.out.println();
        System.out.println(countNode(root));

        System.out.println(nodeSum(root));
    }
}
