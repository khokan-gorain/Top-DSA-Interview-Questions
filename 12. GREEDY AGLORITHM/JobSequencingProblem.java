import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencingProblem {
    
    public static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++){
           jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        //Arrays.sort(jobInfo, Comparator.comparingDouble(o -> o[1]));
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

       ArrayList<Integer> seq = new ArrayList<>();
       int time = 0;
       for(int i=0; i<jobs.size(); i++){
        Job curr = jobs.get(i);
        if(curr.deadline > time){
            seq.add(curr.id);
            time++;
        }
       }
       System.out.println("Maximum jobs = "+seq.size());
       for(int i=0; i<seq.size(); i++){
        System.out.print(seq.get(i)+" ");
       }

    }

}
