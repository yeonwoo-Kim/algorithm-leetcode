class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int today = 0;
        int all = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buy) buy = prices[i];
            today = prices[i]  - buy;
            if(all < today) all = today;
        }
        
        return all;
    }
}