public class Call {
    
    public static void Call(int n){

       
        // base case 
        if(n==0){
            System.out.println("--------Bye Bye-------");
            return;
        }

        for(int i=0; i<2; i++){
            System.out.println(i +" -> i");
             System.out.println(n +" -> n");
             Call(n-1); // recursion function call 
        }
    }

    public static void main(String[] args) {
        Call(2);
    }
}



