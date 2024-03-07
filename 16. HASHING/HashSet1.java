import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(9);

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.remove(1));
        System.out.println(hs.isEmpty());

        // Iterator for print
      Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
     
        // for each loop for print
        for(Integer i : hs){
            System.out.println(i);
        }
    }
}
