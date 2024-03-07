public class SortedArrayToBalanceBST {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node balanceBST(int arr[], int st, int end){
        if(st > end){
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = balanceBST(arr, st, mid-1);
        root.right = balanceBST(arr, mid+1, end);

        return root;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};

        System.out.println(balanceBST(arr, 0, 6).data);
    }
}
