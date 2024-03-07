import java.lang.annotation.Retention;
import java.util.ArrayList;

public class Heap {

    static class Heap1{
        ArrayList<Integer> arr = new ArrayList<>();

        // add function
        public void add(int data){
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x-1)/2;
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                x = par;
                par = (x-1)/2;
            }
        }

        // peek function
        public int peek(){
            return arr.get(0);
        }

        // heapify function
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        // remove function
        public int remove(){
            int data = arr.get(0);
            //swap first and last node

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // delete last node
            arr.remove(arr.size() - 1);

            // heapify method for manage heap
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap1 heap = new Heap1();
        heap.add(4);
        heap.add(8);
        heap.add(2);
        heap.add(1);

        while (!heap.isEmpty()) {
            System.out.print(heap.peek()+ " ");
            heap.remove();
        }
    }
}