
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int finalmax = 0;
        for(int i = 1; i < prices.length; i++) {
            int diff = prices[i] - min;
            if(diff > finalmax) {
                finalmax = diff;
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }
        return finalmax;
    }
}
