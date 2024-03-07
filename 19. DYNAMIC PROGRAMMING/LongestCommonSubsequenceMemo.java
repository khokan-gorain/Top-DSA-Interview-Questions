public class LongestCommonSubsequenceMemo {
    
    public static int lcs(String str1, String str2, int n, int m, int dp[][]){

        if(n == 0 || m == 0){ // base case
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = lcs(str1, str2, n-1, m-1, dp)+1;
        } else {
            int ans1 = lcs(str1, str2, n-1, m, dp);
            int ans2 = lcs(str1, str2, n, m-1, dp);

            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(lcs(str1, str2, n, m, dp));
    }
}
