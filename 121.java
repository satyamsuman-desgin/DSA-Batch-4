class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int minPrice = prices[0];
        for (int i = 0 ; i < n ; i++) {
        minPrice = Math.min(minPrice,prices[i]);
        profit = Math.max(prices[i] - minPrice, profit);
    }

    return profit;

    }
}
