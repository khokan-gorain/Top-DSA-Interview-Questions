import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> country = new HashMap();
        country.put("India", 140);
        country.put("Pakistan", 40);
        country.put("chaina", 142);

        System.out.println(country);
        System.out.println(country.get("chaina"));
        System.out.println(country.size());
        System.out.println(country.remove("chaina"));
        country.put("Nepal",32);

        Set<String> keys = country.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println(k);
        }
    }
}