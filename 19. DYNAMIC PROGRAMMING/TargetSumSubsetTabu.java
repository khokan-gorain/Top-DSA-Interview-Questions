public class TargetSumSubsetTabu {
    
    public static boolean targetSumSubSet(int item[], int sum){

        int n = item.length;
        boolean dp[][] = new boolean[n+1][sum+1];

        for(int i=0; i<dp.length; i++){ // for item value
            dp[i][0] = false;
        }

        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = true;
        }

        for(int i=1; i<n+1; i++){ // for item value 
            for(int j=1; j<sum+1; j++){ // for item sum 
                int v = item[i-1];

                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                } else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            } 
            System.out.println();
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int item[] = {4,2,7,1,3};
        int sum = 12;
        System.out.println(targetSumSubSet(item, sum));
    }
}
