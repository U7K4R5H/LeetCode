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
        /*
            \U0001d470\U0001d48f\U0001d495\U0001d496\U0001d48a\U0001d495\U0001d48a\U0001d490\U0001d48f: This is an observation-based problem you need to take 
            some examples and try out some examples.

            \U0001d468\U0001d491\U0001d491\U0001d493\U0001d490\U0001d482\U0001d484\U0001d489: 
            1. Start traversing the array backward's from len-2 index and find 
            index of such an element whose value is smaller than it's right digit. 
            Let's call this index as left.
            2. If the above index is -1(Array is already sorted) then reverse it. 
            this is an edge case.
            3. Else again traverse the array backwords and find the index(right) 
            of an element which is greater then element at left index.
            4. Swap the elements at left and right index positions.
            5. Finally reverse the array from left + 1 index to the end.

            \U0001d47b\U0001d48a\U0001d48e\U0001d486 \U0001d46a\U0001d490\U0001d48e\U0001d491\U0001d48d\U0001d486\U0001d499\U0001d48a\U0001d495\U0001d49a: This algorithm will take linear time and constant space.
        */
        if(nums == null || nums.length <= 1)
            return;
        
        int len = nums.length;
        int left = len - 2;
        
        while(left >= 0 && nums[left] >= nums[left+1])
            left--;
        
        if(left >= 0){
            int right = len - 1;
            while(right >= 0 && nums[left] >= nums[right])
                right--;
            
            swap(nums, left, right);
        }
        
        reverse(nums, left+1);
    }
    
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void reverse(int[] nums, int low) {
        int left = low;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}