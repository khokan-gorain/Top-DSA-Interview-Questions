public class maxsubarraysum3 {
    public static int maxSum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0;i<num.length;i++){ // 1,-2,6,-1,3
             currentSum = currentSum+num[i];

             if(currentSum < 0){
                currentSum = 0;
             }

             maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        System.out.println(maxSum(num));
    }
}
