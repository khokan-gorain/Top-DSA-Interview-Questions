import java.util.ArrayList;

public class MostFrequentNumber {

    public static int mostFrequentNumber(ArrayList<Integer> nums, int target){
        int result[] = new int[1000];

        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == target){
                result[nums.get(i+1)-1]++; // counting sort logic 
            }
        }

        int mostFreqNo = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++){
            if(result[i] > mostFreqNo){
                mostFreqNo = result[i];
                ans = i+1;
            }
        }
        return ans;

    }
  
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        System.out.println(mostFrequentNumber(nums, 1));
    }
}
