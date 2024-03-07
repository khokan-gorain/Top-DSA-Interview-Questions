import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> country = new LinkedHashMap();
        country.put("India", 140);
        country.put("Nepal", 32);
        country.put("Chaina", 142);
        country.put("Pakistan", 46);

        System.out.println(country);
        System.out.println(country.remove("Nepal"));
        System.out.println(country.size());

        Set<String> key = country.keySet();
        System.out.println(key);

        for(String k : key){
            System.out.println(k);
        }
    }
}
