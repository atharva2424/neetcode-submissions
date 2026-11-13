class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2)
        {
            return nums.length;
        }
        int max  = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int i:nums)
        {
            if(!set.contains(i-1))
            {
                int count = 0;
                int temp = i;
                while(set.contains(temp++))
                {
                    count++;
                }
                max = max>count?max:count;
            }
        }
        return max;
    }
}
