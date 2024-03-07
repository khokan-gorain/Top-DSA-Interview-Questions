public class Factorial {
    public static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }
        fact(n-1); // 5,4,3,2,1
        int fn = n*fact(n-1);
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
