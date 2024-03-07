import java.util.HashMap;

public class LargestSubArryWith0Sum {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0; // key
        int len = 0; // value

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(map.containsKey(sum)){ //15, -2
                len = Math.max(len, i - map.get(sum)); // 0 - 0
            } else {
                map.put(sum, i);
            }
        }

        System.out.println("Largest Subarray Sum is: "+len);
    }
}
