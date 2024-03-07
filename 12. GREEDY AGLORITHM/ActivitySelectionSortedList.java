import java.util.*;
public class ActivitySelectionSortedList {
    
    public static void main(String[] args) {
        
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int maxActivity = 0;
        int endActivity;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        maxActivity = 1;
        endActivity = end[0];

        for(int i=0; i<end.length; i++){
            if(start[i] >= endActivity){
                maxActivity++;
                ans.add(i);
                endActivity = start[i];
            }
        }

        System.out.println("Maximum Activity = "+maxActivity);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
