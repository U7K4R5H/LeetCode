class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int ans[] = new int[k];
        
        //Creating HashMap for storing frequency of unique nums[i]
        
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i], 1);
            }
        }
        //Creating MaxHeap using conperator of the frequency in hashMap of values
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b)-> hm.get(b) - hm.get(a));
        for(int key : hm.keySet()) {
            maxHeap.add(key);
        }
        
        for(int i=0; i<k; i++) {
            ans[i] = maxHeap.poll();
        }
        return ans;
    }
}