import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Khokan");
        ts.add("Shubham");
        ts.add("Alok");
        ts.add("Amit");
        ts.add("Amit");

        System.out.println(ts);


        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(String s : ts){
            System.out.println(s);
        }
    }
}
