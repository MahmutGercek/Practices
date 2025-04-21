public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices ={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int maxprofit=0;
        int smallest=prices[0];
        for(int i=0;i<prices.length;i++){
           smallest=Math.min(smallest,prices[i]);
           maxprofit=Math.max(maxprofit,prices[i]-smallest);
        }
        return maxprofit;
    }
}
