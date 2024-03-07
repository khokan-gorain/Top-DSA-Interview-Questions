import java.util.Arrays;

public class CatalansNumberMemo {
    
    public static int catalanNumber(int n, int dp[]){

        if(n == 0 || n == 1){ // base case
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            ans += catalanNumber(i, dp) * catalanNumber(n-i-1, dp);
        }
        
        return dp[n] = ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }

        System.out.println(catalanNumber(n, dp));
    }
}
