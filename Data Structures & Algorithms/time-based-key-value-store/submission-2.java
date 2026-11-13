class TimeMap {
    HashMap<String, HashMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        HashMap<Integer, String> valueMap = new HashMap<Integer, String>();
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
        HashMap<Integer, String> valueMap = map.get(key);
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
