public class QueueUsingArray {
    
   static class Queue{
        public static int arr[];
        public static int size;
        public static int rear;

            Queue(int n){
                arr = new int[n];
                size = n;
                rear = -1;
            }

            public static boolean isEmpty(){
            return rear == -1;
        }
   
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full...");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty...");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }

            rear = rear - 1;
            return front;
        }
    
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty...");
                return -1;
            }
                return arr[0];
        }
    }


   public static void main(String[] args) {
    
    Queue q = new Queue(5);

    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()){
        System.out.print(q.peek()+" ");
        q.remove();
    }
   }


}
