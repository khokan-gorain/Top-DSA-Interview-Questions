import java.util.Arrays;

public class ClimbingStairs {
    
    public static int countStairs(int n, int ways[]){

        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countStairs(n-1, ways) + countStairs(n-2, ways);
        return ways[n];
    }
    

    public static void main(String[] args) {
        int n = 3;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countStairs(n, ways));
    }
}
