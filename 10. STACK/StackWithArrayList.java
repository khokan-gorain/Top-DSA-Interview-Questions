import java.util.ArrayList;
public class StackWithArrayList {

  static class Stack{
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }

            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }

        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
   
}
