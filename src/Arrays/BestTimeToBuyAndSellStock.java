package Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] stocks={7,1,5,3,6,4};
        int byD=0;
        int sellD=0;
        int profit=0;
        int byStocks=stocks[0];
        int tempD=0;
        for (int i = 0; i < stocks.length; i++) {
            if (byStocks>stocks[i]){
                byStocks=stocks[i];
                tempD=i;
            }
            int currentProfit=stocks[i]-byStocks;
            if (currentProfit>profit){
                profit=currentProfit;
                byD=tempD+1;
                sellD=i+1;
            }
        }
//            profit=Math.max(profit,stocks[i]-byStock);
//        }
        System.out.println("by on "+byD+" sell on "+sellD+" "+profit);
    }
}
