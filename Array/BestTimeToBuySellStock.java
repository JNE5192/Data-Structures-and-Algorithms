/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyingPrice = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < minBuyingPrice)
                minBuyingPrice = prices[i];
            else if (prices[i] - minBuyingPrice > maxProfit)
                maxProfit = prices[i] - minBuyingPrice;
        }
        return maxProfit;
    }
}