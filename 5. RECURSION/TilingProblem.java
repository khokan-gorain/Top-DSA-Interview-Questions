public class TilingProblem {
   public static int tilingProblem(int n){

    // base case
    if(n==1 || n == 0){
        return 1;
    }
    // vertical position 
    int fnm1 = tilingProblem(n-1);
    
    // horizontial position
    int fnm2 = tilingProblem(n-2);
    int totalWays = fnm1 + fnm2;
    return totalWays;
   }

   public static void main(String[] args) {
    System.out.println(tilingProblem(0));
   }
}

