import java.util.ArrayList;

public class BSTtoBalanceBST {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorderArrayList){
        if(root == null){ // base case
            return;
        }

        getInorder(root.left, inorderArrayList);
        inorderArrayList.add(root.data);
        getInorder(root.right, inorderArrayList);
    }

    public static Node createBST(ArrayList<Integer> arrayList, int st, int end){

        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arrayList.get(mid));
        root.left = createBST(arrayList, st, mid-1);
        root.right = createBST(arrayList, mid+1, end);

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

        ArrayList<Integer> arrayList = new ArrayList<>();
        getInorder(root, arrayList);

        System.out.println(createBST(arrayList, 0, 6).data);
    }
}
