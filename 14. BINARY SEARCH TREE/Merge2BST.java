import java.util.ArrayList;

public class Merge2BST {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arrayList){
        if(root == null){ //base case
            return;
        }

        getInorder(root.left, arrayList);
        arrayList.add(root.data);
        getInorder(root.right, arrayList);
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

    public static Node merge2BST(Node root1, Node root2){

        // step 1: inorder sorted order root1
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        getInorder(root1, arrayList1);

        // step 2: inorder sorted order root2
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        getInorder(root2, arrayList2);

        // step 3: merge two bst
        int i=0,j=0;
        ArrayList<Integer> finalArrayList = new ArrayList<>();
        while (i<arrayList1.size() && j<arrayList2.size()) {
            if(arrayList1.get(i) <= arrayList2.get(j)){
                finalArrayList.add(arrayList1.get(i));
                i++;
            } else {
                finalArrayList.add(arrayList2.get(j));
                j++;
            }
        }

        while (i<arrayList1.size()) {
            finalArrayList.add(arrayList1.get(i));
            i++;
        }

        while (j<arrayList2.size()) {
           finalArrayList.add(arrayList2.get(j));
           j++; 
        }

        // step 4: create single bst
        Node root = createBST(finalArrayList, 0, finalArrayList.size()-1);
        return root;
    }

    public static void inoderTraversal(Node root){
        if(root == null){ // base cae
          return;
        }
        inoderTraversal(root.left);
        System.out.print(root.data+"->");
        inoderTraversal(root.right);
    }

    public static void main(String[] args) {
        
        // first root node
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);

        // second root node
        Node root2 = new Node(5);
        root2.left = new Node(4);
        root2.right = new Node(6);

        Node root = merge2BST(root1, root2);
        inoderTraversal(root);
    }
}
