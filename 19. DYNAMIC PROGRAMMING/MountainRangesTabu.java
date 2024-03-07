public class MountainRangesTabu {
    
    public static int mountainRanges(int n){

        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n+1; i++){
            for(int j=0; j<i; j++){
                int upMountain = dp[j];
                int downMountain = dp[i-j-1];
                dp[i] += upMountain * downMountain;
            }
        }

        for(int i=0; i<dp.length; i++){
            System.out.print(dp[i]+" ");
        }

        System.out.println();
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRanges(n));
    }

}
