class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1)
        return nums;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        @SuppressWarnings("Unchecked")
        List<Integer>[] bucket = (List<Integer>[]) new List[nums.length + 1];
        for(Integer i: map.keySet())
        {
            int index = map.get(i);
            if(bucket[index]==null)
            {
                bucket[index] = new ArrayList<>();
            }
            bucket[index].add(i);
            
        }
        int res[] = new int[k];
        int a = 0;
        for(int i = bucket.length-1;i>=0&&a<k;i--)
        {
            if(bucket[i]!=null)
            {
                for(int j:bucket[i])
                {
                    if(a<k)
                    res[a++] = j;
                }
            }
        }
        return res;
    }
}
