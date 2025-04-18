public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices ={1,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int maxprofit=0;
        int l=prices.length;
        int comparer=prices[0]; int indexofcomparer=0;
        int smallestprice=prices[0]; int indexofsmallestprice=0;
        for(int i=1;i<l;i++){
           if(prices[i]<smallestprice){
               smallestprice=prices[i];
               indexofsmallestprice=i;
           }
           if(indexofcomparer<indexofsmallestprice){
               comparer=prices[i];
               indexofcomparer=i;
               continue;
           }
           else {
               comparer=prices[i];
               indexofcomparer=i;
               if(comparer-smallestprice>maxprofit){
                   maxprofit=comparer-smallestprice;
               }
           }

        }
        return maxprofit;
    }
}
