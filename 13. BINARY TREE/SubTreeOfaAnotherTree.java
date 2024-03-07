public class SubTreeOfaAnotherTree {
    
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

    public static boolean isIdentical(Node root, Node subTree){
        if(root == null && subTree == null){
            return true;
        } else if(root == null || subTree == null || root.data != subTree.data){
            return false;
        }
        if(!isIdentical(root.left, subTree.left)){
            return false;
        }
        if(!isIdentical(root.right, subTree.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node treeRoot, Node subTreeRoot){
        if(treeRoot == null){
            return false;
        }

        if(treeRoot.data == subTreeRoot.data){
            if(isIdentical(treeRoot, subTreeRoot)){
                return true;
            }
        }
        return isSubTree(treeRoot.left, subTreeRoot) || isSubTree(treeRoot.right, subTreeRoot);
    }
 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);

        System.out.println(isSubTree(root, subTree));
    }
}
