class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int res[] = new int[3];
        for(int i=0 ;i<nums.length; i++) {
            res[nums[i]]++;
        }
        int x = 0;
        for(int i=0; i<res[0]; i++) {
            nums[x] = 0;
            x++;
        }
        for(int i=0; i<res[1]; i++) {
            nums[x] = 1;
            x++;
        }
        for(int i=0; i<res[2]; i++) {
            nums[x] = 2;
            x++;
        }
    }
}