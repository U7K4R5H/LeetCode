class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        
        int profit = 0;
        for(int i=0; i<prices.length; i++) {
            minprice = Math.min(minprice, prices[i]);
            profit = Math.max(profit, prices[i] - minprice);
        }

        return profit;
    }
}