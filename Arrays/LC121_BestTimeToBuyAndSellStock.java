class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - min;

            if (profit > max) {
                max = profit;
            }

            if (min > prices[i]) {
                min = prices[i];
            }
        }

        return max;
    }
}