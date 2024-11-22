
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n= prices.length;
        
        //corner case when array has less than one price
        if(n<=1){
            return 0;
        }
        
        // Initialize minPrice to the first price
        // Initialize maxProfit to zero
        int minPrice = prices[0];
        int maxprofit = 0;
        
         for (int i = 1; i < n; i++){
            if(prices[i] < minPrice){
                
                //update the minPrice
                minPrice = prices[i];
            }
            int profit= prices[i] - minPrice;
            
            if(profit > maxprofit){
                
                //Update maxprofit
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
