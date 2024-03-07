public class maxsubarraysum {

    public static int maxSum(int num[]){
        
        int maxarraysum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                sum = 0;
                for(int k=i;k<=j;k++){
                    sum += num[k];
                }
                if(maxarraysum < sum){
                    maxarraysum = sum;
                }
            }
        }
    
        return maxarraysum;
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        System.out.println(maxSum(num));
    }
}
