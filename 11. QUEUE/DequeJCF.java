import java.util.Deque;
import java.util.LinkedList;
public class DequeJCF {
    
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addLast(6);
         dq.removeFirst();
         dq.removeLast();
         
        while (!dq.isEmpty()) {
            System.out.print(dq.peek()+" ");
            dq.remove();
        }
    }
}
