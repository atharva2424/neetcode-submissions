class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs)
        {
            int hash[] = new int[26];
            for(char ch: str.toCharArray())
            {
                hash[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:hash)
            {
                sb.append(i).append("#");
            }
            String id = sb.toString();
            if(map.containsKey(id))
            {
                map.get(id).add(str);
            }
            else
            {
                map.put(id, new ArrayList<>(List.of(str)));
            }
        }
        res.addAll(map.values());
        return res;
    }
}
