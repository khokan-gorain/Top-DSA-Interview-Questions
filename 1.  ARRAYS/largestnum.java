import java.util.*;

public class largestnum {
    
    public static int largest(int num[]){
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(maxNumber < num[i]){
                maxNumber = num[i];
            }
        } 
        return maxNumber;
    }


    public static void main(String[] args) {
        int num[] = {4,87,1,91,9};
        System.out.println("Maximun number is "+largest(num));
    }
}
