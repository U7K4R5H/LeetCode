// class Solution {
//     public void sortColors(int[] nums) {
//         //Arrays.sort(nums);
//         int res[] = new int[3];
//         for(int i=0 ;i<nums.length; i++) {
//             res[nums[i]]++;
//         }
//         int x = 0;
//         for(int i=0; i<res[0]; i++) {
//             nums[x] = 0;
//             x++;
//         }
//         for(int i=0; i<res[1]; i++) {
//             nums[x] = 1;
//             x++;
//         }
//         for(int i=0; i<res[2]; i++) {
//             nums[x] = 2;
//             x++;
//         }
//     }
// }

class Solution {
    public void sortColors(int[] nums) {
        int lo = 0; 
        int hi = nums.length - 1; 
        int mid = 0; 
        int temp; 
        while (mid <= hi) { 
            switch (nums[mid]) { 
                case 0: { 
                    temp = nums[lo]; 
                    nums[lo] = nums[mid]; 
                    nums[mid] = temp; 
                    lo++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = nums[mid]; 
                    nums[mid] = nums[hi]; 
                    nums[hi] = temp; 
                    hi--; 
                    break; 
                } 
            } 
        }
    }
}