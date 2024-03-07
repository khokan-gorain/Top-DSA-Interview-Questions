import java.util.TreeMap;
import java.util.Set;

public class TreeMap3 {
    
    public static void main(String[] args) {
        
        TreeMap<String, Integer> country = new TreeMap();
        country.put("India", 140);
        country.put("Nepal", 32);
        country.put("Chaina", 142);
        System.out.println(country);

        System.out.println(country.get("Chaina"));
        System.out.println(country.size());

        Set<String> keys = country.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println(k);
        }
    }
}
