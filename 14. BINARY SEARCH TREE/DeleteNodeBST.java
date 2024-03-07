public class DeleteNodeBST {

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

    public static Node inorderSuccessour(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node deleteNode(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data > key){
            root.left = deleteNode(root.left, key);
        } else if(root.data < key){
            root.right = deleteNode(root.right, key);
        } else {
            // case 1: leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2: single child
            if(root.left == null){
                return root.right;
            }

            // case 3: two child
            Node inorderSucc = inorderSuccessour(root); 

            root.data = inorderSucc.data;
            root.right = deleteNode(root.right, inorderSucc.data);
        }
        return root;
    }

    public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            // root.left.left = new Node(4);
            // root.left.right = new Node(5);

            System.out.println(deleteNode(root, 1).data);
    }
}
