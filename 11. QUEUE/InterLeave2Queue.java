import java.util.LinkedList;
import java.util.Queue;
public class InterLeave2Queue {
    
    public static void interLeave2Queue(Queue<Integer> q){
        Queue<Integer> halfQueue = new LinkedList<>();

        int size = q.size();
        for(int i=0; i<size/2; i++){
            halfQueue.add(q.remove());
        }

        while(!halfQueue.isEmpty()){
            q.add(halfQueue.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave2Queue(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
            
    
    }
}
