class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt(), mid = 0, ans=r;
        while(l<=r)
        {
            mid = l + (r-l)/2;
            int t = 0;
            for(int i:piles)
            {
                t = t + (int)Math.ceil((double)i/mid);
            }
            if(t<=h)
            {
                ans = mid;
                r = mid-1;
            }
            else
            l = mid+1;
        }
        return ans;
    }
}
