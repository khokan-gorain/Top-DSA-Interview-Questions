public class IncreasingOder {
   public static void incOrder(int n){
    // base case
    if(n==1){
        System.out.println("1");
        return;
    }
    incOrder(n-1);
    System.out.println(n);
   }

   public static void main(String[] args) {
    incOrder(8);
   }
}
