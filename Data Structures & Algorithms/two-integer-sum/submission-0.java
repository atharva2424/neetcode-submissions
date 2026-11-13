class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            int req = target-nums[i];
            if(map.isEmpty() || !map.containsKey(req))
            {
                map.put(nums[i], i);
            }
            else
            {
                res[0] = map.get(req);
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
