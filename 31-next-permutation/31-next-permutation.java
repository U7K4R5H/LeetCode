/* class Solution {
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
} */
class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length <= 1) return;
      int i = nums.length - 2;
      while(i >= 0 && nums[i] >= nums[i + 1]) i--; 
      if(i >= 0) {                          
        int j = nums.length - 1;           
        while(nums[j] <= nums[i]) j--;           
        swap(nums, i, j);                     
    }
    reverse(nums, i + 1, nums.length - 1);       
}

public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

public void reverse(int[] nums, int i, int j) {
    while(i < j) 
      swap(nums, i++, j--);
}
}