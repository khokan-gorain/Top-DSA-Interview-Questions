import java.util.ArrayList;

public class PairSumSortedAndRotateArray {

    // 2 pointer approch -> O(n)
    public static boolean pariSum(ArrayList<Integer> list, int target){

        // find braking point 
        int bp = 0;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        while(lp != rp){

            // case 1 
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            // case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<>();

        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);

        System.out.println(pariSum(height, 13));
      
    }
}
