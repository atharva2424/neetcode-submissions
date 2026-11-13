class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<String, TreeMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> valueMap = new TreeMap<Integer, String>();
        valueMap.put(timestamp, value);
        if(!map.containsKey(key))
        {
            map.put(key, valueMap);
        }
        else
        {
            valueMap = map.get(key);
            valueMap.put(timestamp, value);
            map.put(key, valueMap);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        return "";
        TreeMap<Integer, String> valueMap = map.get(key);
        String ans = "";
        int max = -1;
        for(int i: valueMap.keySet())
        {
            if(i<=timestamp && i>max)
            {
                max = i;
                ans = valueMap.get(i);
            }
        }
        return ans;
    }
}
