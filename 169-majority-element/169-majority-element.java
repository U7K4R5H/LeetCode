
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
}