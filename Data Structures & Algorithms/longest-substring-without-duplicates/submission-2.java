class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        int arr[] = new int[128];
        while (r < s.length()) {
            char curr = s.charAt(r);
            if (arr[(int) curr] != 0) {
                while (l < r && s.charAt(l) != curr) {
                    arr[(int) s.charAt(l)]--;
                    l++;
                }
                arr[(int) s.charAt(l)]--;
                l++;
            }
            arr[(int)curr]++;
            max = max>(r-l+1)?max:(r-l+1);
            r++;
        }
        return max;
    }
}