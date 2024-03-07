import java.util.Arrays;
public class MinimumAbsoluteDiff {
    
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] ={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }

        int minDiff = 0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Difference is "+ minDiff);
    }
}
