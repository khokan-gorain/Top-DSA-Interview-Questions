import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ChocolaProblem {
    
    public static void main(String[] args) {
        int n = 4, m = 5; //mXn metrix
        Integer  costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

       
        int h=0, v=0; // horizontal/vertical cut
        int hp = 1, vp = 1; // horizontal/vertical pieces
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += costHor[h]*vp;
                h++;
                hp++;
            } else {
                cost += costVer[v]*hp;
                v++;
                vp++;
            }
        }

        // left horizontal pieces
        while(h < costHor.length){
             cost += costHor[h]*vp;
             h++;
             hp++;
        }
        // left vertical pieces
        while(v < costVer.length){
           cost += costVer[v]*hp;
            v++;
            vp++; 
        }

        System.out.println("Minimum Cost = "+cost);

    }
}
