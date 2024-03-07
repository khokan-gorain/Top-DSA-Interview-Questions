import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {
    
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("Nepal");
        lhs.add("Pakintan");
        lhs.add("Chaina");
        System.out.println(lhs);


        Iterator it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(String s: lhs){
            System.out.println(s);
        }
    }
}
