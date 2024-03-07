public class OptimizedPower {
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}
