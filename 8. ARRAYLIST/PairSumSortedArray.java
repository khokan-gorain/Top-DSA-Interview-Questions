import java.util.ArrayList;

public class PairSumSortedArray {

    // 2 pointer approch -> O(n)
    public static boolean pariSum(ArrayList<Integer> list, int target){

        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            
            // case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            // case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);

        System.out.println(pariSum(height, 50));
    }
}
