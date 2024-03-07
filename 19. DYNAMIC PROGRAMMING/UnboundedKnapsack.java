public class UnboundedKnapsack {
    
    public static int unboundedKnapsack(int val[], int wt[], int W){

        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0; // for row initialize
        }

        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = 0; // for column initialize
        }

        for(int i=1; i<n+1; i++){ // for item value
            for(int j=1; j<W+1; j++){ // for item weigth
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]); // add on knapsack
                } else {
                    dp[i][j] = dp[i-1][j]; // remove on knapsack
                }
            }
        }

        return dp[n][W]; // maximum profit 
    }

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;

        System.out.println(unboundedKnapsack(val, wt, w));
    }
}
