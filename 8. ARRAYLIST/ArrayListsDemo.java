import java.util.ArrayList;
public class ArrayListsDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(6);
        list.add(2,30);

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.contains(1));


    }
}
