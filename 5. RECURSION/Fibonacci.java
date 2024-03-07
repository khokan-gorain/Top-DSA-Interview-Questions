public class Fibonacci {
    public static int fibo(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }

        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        return fnm1+fnm2;
    }

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
