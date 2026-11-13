class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r= 0;
        Set<Character> set = new HashSet<Character>();
        char ch[] = s.toCharArray();
        int max = 0;
        while(r<s.length())
        {
            if(!set.contains(ch[r]))
            {
                set.add(ch[r]);
            }
            else
            {
                max = Math.max(max, set.size());
                while(set.contains(ch[r]))
                {
                    set.remove(ch[l]);
                    l++;
                }
                set.add(ch[r]);
            }
            r++;
        }
        return Math.max(max, set.size());
    }
}
