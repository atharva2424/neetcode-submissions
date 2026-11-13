class Solution {
    public int findDuplicate(int[] nums) {
        int ans = -1;
        int arr[] = new int[nums.length];
        for(int i:nums)
        {
            arr[i]++;
            if(arr[i]>1)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
