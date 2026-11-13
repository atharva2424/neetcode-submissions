class Solution {
    public int maxProfit(int[] prices) {
        int l =0, r =0;
        int maxprofit =0;
        while(l<prices.length && r<prices.length)
        {
            int profit = prices[r] - prices[l];
            if(profit<0)
            {
                l++;
                continue;
            }
            if(profit>maxprofit)
            maxprofit = profit;
            r++;
        }
        return maxprofit;
    }
}
