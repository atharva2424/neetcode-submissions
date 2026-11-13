class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<n-2;i++)
        {
            if(i>0 && (nums[i] == nums[i-1]))
            continue;
            int target = -nums[i];
            int l = i+1, r = n-1;
            while(l<r)
            {
                int sum = nums[l] + nums[r]; 
                if(sum<target)
                {
                    l++;
                }
                else if(sum>target)
                {
                    r--;
                }
                else
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while(l<r && (nums[l] == nums[l+1]))
                    l++;
                    while(r>l && (nums[r]==nums[r-1]))
                    r--;
                    l++;
                    r--;
                }
            }
        }
        return res;
    }
}