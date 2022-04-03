class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for(i=nums.length-1; i>=1; i--) {
            if(nums[i-1] < nums[i]){
                break;
            }
        }
        if(i==0) {
            Arrays.sort(nums);
        }
        else {
            
            int min = i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i-1]<nums[j] && nums[j] < nums[min]) {
                    min = j;
                }
            }
            swap(nums, i-1, min);
            Arrays.sort(nums,i,nums.length);
        }
        
    }
    public void swap(int[] n, int i, int j) {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}