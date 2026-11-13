class LRUCache {
    HashMap<Integer, Integer> map;
    HashMap<Integer, Integer> freq;
    int capacity;
    int time = -1;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        freq = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        System.out.println(map);
        System.out.println(freq);
        if (map.containsKey(key)) {
            freq.put(key, ++time);
            return map.get(key);
        }
        return -1;
    }

    public int findMinKey() {
        int min = Integer.MAX_VALUE;
        int minKey = -1;
        for (int key : freq.keySet()) {
            if (freq.get(key) < min) {
                min = freq.get(key);
                minKey = key;
            }
        }
        return minKey;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && map.size() >= capacity) {
            int minKey = findMinKey();
            map.remove(minKey);
            freq.remove(minKey);
        }
        map.put(key, value);
        freq.put(key, ++time);
    }
}
