public class CoinChangeTabu {
    
    public static int coinChange(int coin[], int sum){

        int n = coin.length;
        int dp[][] = new int[n+1][sum+1];

        for(int i=0; i<n+1; i++){
            dp[i][0] = 1; // for row initialize
        }
        
        for(int j=0; j<sum+1; j++){
            dp[0][j] = 0; // for column initialize
        }

        for(int i=1; i<n+1; i++){ // for item value
            for(int j=1; j<sum+1; j++){ // for item weight
                if(coin[i-1] <= j){
                    dp[i][j] = dp[i][j-coin[i-1]]+dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        // for print dp array
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][sum]; // for total ways
    }

    public static void main(String[] args) {
        int coin[] = {2,5,3,6};
        int sum = 10;

        System.out.println(coinChange(coin, sum));
    }
}
