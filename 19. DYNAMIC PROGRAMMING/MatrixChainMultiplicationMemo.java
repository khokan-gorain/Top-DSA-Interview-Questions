import java.util.Arrays;

public class MatrixChainMultiplicationMemo {
    
    public static int mcmMemo(int arr[], int i, int j, int dp[][]){

        if(i == j){ // base case
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            ans = Math.min(ans, cost1+cost2+cost3);
        }

        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int  n = arr.length;

        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        

        System.out.println(mcmMemo(arr, 1, n-1, dp));
    }
}
