/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++) {
           
            for(int j=0;j<nums.length;j++) {
                if(j==i){
                    continue;
                }
                if(nums[i] + nums[j] == target) {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
} */

// Using Hashing TC: O(N) SC: O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                return new int[]{i, hm.get(target - nums[i])};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[0];
    }
}