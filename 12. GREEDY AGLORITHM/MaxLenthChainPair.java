import java.util.Arrays;
import java.util.Comparator;
public class MaxLenthChainPair {
    public static void main(String[] args) {
        int pair[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int minLeanth = 0;

        
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[0]));

        // better understinding 
         for(int i=0; i<pair.length; i++){
            for(int j=0; j<2; j++){
                System.out.print(pair[i][j]+" ");
            }
            System.out.print(",");
        }
       

         minLeanth = 1;
         int chainEnd = pair[0][1];

        for(int i = 1; i<pair.length; i++){
            if(pair[i][0] > chainEnd){
                minLeanth++;
                chainEnd = pair[i][1];

            }
        }
        System.out.println("Min Chain Leanth is = "+minLeanth);
    }
}
