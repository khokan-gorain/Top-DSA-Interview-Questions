import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,1,3,1,5,1,5,5,5};
        HashMap<Integer, Integer> map = new HashMap();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);
        Set<Integer> key = map.keySet();
        System.out.println(key);
        for(Integer k : key){
            if(map.get(k) > nums.length/3){
                System.out.println(k);
            }          
        }
    }
}
