import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(8);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder(null));
        System.out.println(list);
    }
}
