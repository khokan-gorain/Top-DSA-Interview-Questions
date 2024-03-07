public class CircularQueueUsingArray {

    static class Queue{
        public static int arr[];
        public static int size;
        public static int rear;
        public static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full...");
                return;
            }

            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty...");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            } else {
                front  = (front + 1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.err.print("Queue is empty...");
                return -1;
            }

            return arr[front];
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
            
        }
    }
}
