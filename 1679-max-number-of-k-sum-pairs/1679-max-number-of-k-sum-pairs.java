class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0 , i = 0, j = nums.length - 1;
        // two pointer
		while (i < j) {
            int sum = nums[i] + nums[j];
            //increment the count if the sum is same as k
			// then increment i and decrement j
			if (sum == k) {
                cnt++;
                i++;
                j--;
            } else if (sum < k) i++; //increment i if sum is lesser (add the minimum to reach k)
            else j--; //otherwise decrement j 
        }
        return cnt;
  }
}