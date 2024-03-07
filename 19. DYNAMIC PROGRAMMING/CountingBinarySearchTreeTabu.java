public class CountingBinarySearchTreeTabu {
    
    public static void countingBinarySearchTree(int n){

        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        // for n=4
        for(int i=2; i<n+1; i++){
            for(int j=0; j<i; j++){
                int leftTree = dp[j]; // c0
                int rightTree = dp[i-j-1]; // c1

                dp[i] += leftTree * rightTree; // c0*c3 + c1*c2 + c2*c1 + c3*c0
            }
        }

        for(int i=0; i<=n; i++){
            System.out.print(dp[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n=4;

       // System.out.println(countingBinarySearchTree(n));

       countingBinarySearchTree(n);
    }
}
