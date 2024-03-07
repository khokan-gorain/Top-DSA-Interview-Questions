import java.util.ArrayList;

public class MonotonicNumber {

    // monoronic increment or decrement order number
    public static boolean isMonotonic(ArrayList<Integer> number){

        for(int i=0; i<number.size()-1; i++){
            if(number.get(i) >= number.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(8);

        System.out.println(isMonotonic(list));
    }
}
