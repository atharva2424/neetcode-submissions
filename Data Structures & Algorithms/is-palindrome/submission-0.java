class Solution {
    public boolean isAlphaNumeric(char ch)
    {
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
        return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char ch[] = s.toCharArray();
        int l = 0, r = s.length()-1;
        while(l<=r)
        {
            if(!isAlphaNumeric(ch[l]))
            {
                l++;
                continue;
            }
            if(!isAlphaNumeric(ch[r]))
            {
                r--;
                continue;
            }
            if(ch[l]!=ch[r])
            return false;
            l++;
            r--;
        }
        return true;
    }
}
