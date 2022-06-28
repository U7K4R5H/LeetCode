/* Brute force
class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        
        for(int num : nums){
            int count = 0;
            for(int elem : nums) {
                if(elem == num) {
                    count++;
                }
            }
            
            if(count > majorityCount) {
                return num;
            }
        }
        return -1;
    }
} */

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if(!hm.containsKey(num)) {
                hm.put(num, 1);
            } else {
                hm.put(num, hm.get(num) + 1);
            }
            if(hm.get(num) > nums.length / 2) {
                res = num;
                break;
            }
        }
        return res;
    }
}