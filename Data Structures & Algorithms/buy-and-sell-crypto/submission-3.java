class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 0, n = prices.length;
        int profit = 0, maxProfit = -1;
        while(l<n && r<n)
        {
            profit = prices[r] - prices[l];
            if(profit<0)
            {
                l++;
            }
            else
            {
                if(profit>maxProfit)
                maxProfit = profit;
                r++;
            }
        }
        return maxProfit;
    }
}
