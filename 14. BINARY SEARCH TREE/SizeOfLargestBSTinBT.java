public class SizeOfLargestBSTinBT {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root){

        if(root == null){
            return new Info(true, size, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max= Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max)
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, max);
            return new Info(true, size, min, max)
        }

        return new Info(false, size, min, max)
    }
}
