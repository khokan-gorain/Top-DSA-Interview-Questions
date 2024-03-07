public class RodCuttingTabu {
    

    public static int rodCuttingTabu(int length[], int price[], int totRodLength){

        int n = price.length;
        int dp[][] = new int[n+1][totRodLength+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<totRodLength+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0; 
                }
            }
        }

        for(int i=1; i<n+1; i++){ // for rod length
            for(int j=1; j<totRodLength+1; j++){ // for cutting price
                if(length[i-1] <= j){ // 2 <= 1
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][totRodLength];
    }

    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int rodLength = 8;

        System.out.println(rodCuttingTabu(length, price, rodLength));
    }
}
