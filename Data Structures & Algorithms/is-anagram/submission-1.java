class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int freq[] = new int[26];
        char ch[] = s.toCharArray();
        for(int i = 0;i<s.length();i++)
        {
            freq[ch[i]-'a']++;
        }
        ch = t.toCharArray();
        for(int i = 0;i<t.length();i++)
        {
            if(freq[ch[i]-'a'] ==0)
            return false;
            else
            {
                freq[ch[i]-'a']--;
            }
        }
        return true;
    }
}
