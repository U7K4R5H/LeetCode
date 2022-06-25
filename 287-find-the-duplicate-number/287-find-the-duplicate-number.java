class Solution {
    // public int findDuplicate(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         int current=Math.abs(nums[i]);
    //             if(nums[current]<0){
    //                 return current;
    //                  }
    //         nums[current]*=-1;
    //         }
    //     return -1;
    // }
    
        public int findDuplicate(int[] nums) {
        
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];
        
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return tortoise;
    }   
}