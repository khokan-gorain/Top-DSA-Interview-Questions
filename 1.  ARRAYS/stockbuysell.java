import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class stockbuysell {
    public static int stockBuyAndSell(int price[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<price.length;i++){ // 7 1 5 3 6 4 
            if(buyPrice < price[i]){    //+infinty < 7
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7,6,4,3,1};
        System.out.println("Max Profit "+stockBuyAndSell(price));
    }
}
