/*class MyHashMap {
    private HashMap<Integer, Integer> hm;
    public MyHashMap() {
        hm = new HashMap<>();
    }
    
    public void put(int key, int value) {
        hm.put(key, value);
    }
    
    public int get(int key) {
        int result = -1;
        if(hm.containsKey(key)) result = hm.get(key);
        return result;
    }
    
    public void remove(int key) {
        if(hm.containsKey(key)) hm.remove(key);
    }
}*/

class MyHashMap {
    int[] map;
    public MyHashMap() {
        map = new int[1000000+1];
    }
    
    public void put(int key, int value) {
        map[key] = value+1;
    }
    
    public int get(int key) {
        return map[key]-1;
    }
    
    public void remove(int key) {
        map[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */