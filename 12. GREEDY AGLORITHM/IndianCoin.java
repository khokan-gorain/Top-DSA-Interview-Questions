import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoin {
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins);

        int countofCoin = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=coins.length-1; i>=0; i--){
            if(amount >= coins[i]){
                while(amount >= coins[i]){
                    countofCoin++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }

            }
        }

        System.out.println("Total Number of Coins = "+countofCoin);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
