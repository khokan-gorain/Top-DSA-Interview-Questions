import java.util.HashSet;
import java.util.Iterator;

public class Intersection {
    
    public static void intersection(int arr1[], int arr2[]){

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                hs.remove(arr2[i]);
            }
        }

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,5,3,8,9};
        intersection(arr1, arr2);
    }
}
