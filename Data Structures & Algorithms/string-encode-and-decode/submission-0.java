class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str:strs)
        {
            res = res + str + 'é';
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        String temp = "";
        for(char ch:str.toCharArray())
        {
            if(ch!='é')
            {
                temp = temp + ch;
            }
            else
            {
                list.add(temp);
                temp = "";
            }
        }
        return list;
    }
}
