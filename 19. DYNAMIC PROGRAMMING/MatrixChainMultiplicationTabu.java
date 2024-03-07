public class MatrixChainMultiplicationTabu {
    
    public static int mcmTabu(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];

        for(int i=0; i<n; i++){
            dp[i][i] = 0;
        }

        // tabulation code
        for(int len=2; len<=n-1; len++){
            for(int i=1; i<n-len; i++){
                int j = i+len-1; // column
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[1][n-1];
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};

        System.out.println(mcmTabu(arr));
    }
}
