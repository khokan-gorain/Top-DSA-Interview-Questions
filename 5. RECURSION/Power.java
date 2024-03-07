public class Power {
    public static int power(int x,int n){ // x=2, n=4
        // base case
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1); // 4,3,2,1
        int xn = x*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}
