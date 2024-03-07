public class FriendsPairing {
    public static int friendspairing(int n){

        // base case
        if(n == 1 || n == 2){
            return n;
        }
         
        // single
        int fnm1 = friendspairing(n-1);

        // pair 
        int fnm2 = friendspairing(n-2);
        int pairWays = (n-1)*fnm2;
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendspairing(4));
    }
}
