public class Fibonacci {

    public static int fibo(int n, int f[]){

        if(n == 1 || n == 0){ // base case
            return n;
        }

        if(f[n] != 0){
            return f[n];
        }

        f[n] = fibo(n-1, f) + fibo(n-2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n+1];
        fibo(n, f);
        for(int i=0; i<f.length; i++){
            System.out.print(f[i]+",");
        }
    }
}