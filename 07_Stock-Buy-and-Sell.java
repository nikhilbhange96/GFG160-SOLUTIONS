class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int maxprofit=0;
        int n=prices.length;
        for(int i=1;i<n; i++){
            if(prices[i]>prices[i-1]){
                maxprofit+=prices[i]-prices[i-1];
                
            }
        }
        return maxprofit;
    }
}
