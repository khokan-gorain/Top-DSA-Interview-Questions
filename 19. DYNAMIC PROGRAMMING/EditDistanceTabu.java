public class EditDistanceTabu {
    
    public static int editDistance(String str1, String str2){

        int n = str1.length();
        int m = str1.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){ // for str1
            for(int j=0; j<m+1; j++){ // for str2
                if(i == 0){ // row initialized
                    dp[i][j] = j;
                }
                if(j == 0){ // column initialized
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1; i<n+1; i++){ // abc
            for(int j=1; j<m+1; j++){ // sbd
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j]+1;
                    int rep = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(Math.min(del, rep), add);
                }
            }
        }

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "Intention";
        String str2 = "Execution";

        System.out.println(editDistance(str1, str2));
    }
}
