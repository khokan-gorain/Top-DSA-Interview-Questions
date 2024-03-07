import java.util.ArrayList;
public class MultiDimensionArrayList {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(43);
        list1.add(12);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(23);
        list2.add(90);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);
    }
}
