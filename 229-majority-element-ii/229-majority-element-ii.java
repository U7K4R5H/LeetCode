class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if(!hm.containsKey(num)) {
                hm.put(num, 1);
            } else {
                hm.put(num, hm.get(num) + 1);
            }
            if( (hm.get(num) > nums.length / 3) && (!res.contains(num)) ) {
                res.add(num);
            }
        }
        return res;
    }
}