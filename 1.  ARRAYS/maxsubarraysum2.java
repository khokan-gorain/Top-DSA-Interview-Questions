public class maxsubarraysum2 {
    
    public static int maxSum(int num[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for(int i=1;i<num.length;i++){
            prefix[i] = prefix[i-1]+num[i];
        }

        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currentSum = i==0? prefix[j]: prefix[j] - prefix[i-1];

                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxSum(num);
    }
}
