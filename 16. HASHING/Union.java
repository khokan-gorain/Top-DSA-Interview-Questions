import java.util.HashSet;
import java.util.Iterator;

public class Union {
    
    public static void union(int arr1[], int arr2[]){

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
           hs.add(arr2[i]);
        }

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,7,4,9,0};
        union(arr1, arr2);
    }
}
