class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int cnt = 0, cnt2 = 0, first = nums[0];
        for(int i=0; i<nums.length - 1; i++) {
            if(nums[i] + 1 == nums[i + 1]) {
                cnt++;
                continue;
            }
            else if(nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                cnt2 = Math.max(cnt, cnt2);
                cnt = 0;
            }
        }
        return Math.max(cnt, cnt2)+1;
    }
}