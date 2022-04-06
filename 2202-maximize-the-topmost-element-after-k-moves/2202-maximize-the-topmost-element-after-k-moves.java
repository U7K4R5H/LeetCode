class Solution {
    public int maximumTop(int[] nums, int k) {
        int max = -1;
        if(nums.length == 1) {
            if(k%2==1){
                return -1;
            }
            else {
                return nums[0];
            }
            
        }
         if(k > nums.length){
            k = nums.length + 1; 
        }
         if(k < nums.length) {
             max = nums[k]; //stack top if all k is removed
        }
        //for loop for k==nums.length
        for(int i=0; i<k-1; i++) {// k-2 index is kth-1 operation
            if(nums[i] > max) {
                max = nums[i];
            }
        }
            return max;
    }
}