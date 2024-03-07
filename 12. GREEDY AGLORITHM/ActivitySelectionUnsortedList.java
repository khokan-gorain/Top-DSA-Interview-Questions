import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnsortedList {
    
    public static void main(String[] args) {
        int start[] = {0,1,3,8,5,5};
        int end[] ={7,6,4,2,9,9};

        // tow dimension array
        int activites[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        // sorted activity with end time 
        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2]));


        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivity = 1;
        ans.add(activites[0][0]);
        int endActivity = activites[0][2];

        for(int i=0; i<activites.length; i++){
            if(activites[i][1] >= endActivity){
                maxActivity++;
                ans.add(activites[i][1]);
                endActivity = activites[i][2];
            }
        }
        System.out.println("Maximun Actvitys ="+maxActivity);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}
