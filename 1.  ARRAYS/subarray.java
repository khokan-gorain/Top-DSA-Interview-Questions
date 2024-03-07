public class subarray {

    public static void subArrays(int num[]){
        int totalNumberOfSubArray = 0;
        for(int i=0;i<num.length;i++){ // 1 2 3 4 5 6
            for(int j=0;j<num.length;j++){ // 1
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    
                } 
                totalNumberOfSubArray++;
                System.out.println();      
            }
            System.out.println(); 
        }

        System.out.println(totalNumberOfSubArray);
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subArrays(num);
    }
    
}
