import java.util.Arrays;

public class Knapsack01Memo {
    
    public static int knapsack01Memo(int val[], int wt[], int n, int w, int dp[][]){

        if(w == 0 || n == 0){ // base case
            return 0;
        }

        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1] <= w){ // n means dp index i

            // add on knapsack(Bag)
            int ans1 = val[n-1] + knapsack01Memo(val, wt, n-1, w-wt[n-1], dp);

            // remove from knapsack(Bag)
            int ans2 = val[n-1] + knapsack01Memo(val, wt, n-1, w, dp);

            return dp[n][w] = Math.max(ans1, ans2);
        } else {
            // remove from knapsack(Bag)
            return  dp[n][w] = knapsack01Memo(val, wt, n-1, w, dp);
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;

        int dp[][] = new int[val.length+1][w+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack01Memo(val, wt, val.length, w, dp));
    }
}
