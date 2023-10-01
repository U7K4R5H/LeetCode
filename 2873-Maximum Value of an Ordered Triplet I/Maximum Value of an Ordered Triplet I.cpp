class Solution {
    public: long long maximumTripletValue(vector < int > & nums) {
    int n = nums.size();
	int max_diff = INT_MIN;
	int max_n = INT_MIN;
	int max_k = INT_MIN;
	long long ans = 0;
	vector<int> max_num(n);
	for (int i = n - 1; i >= 0; i--) {
		max_n = max(max_n, nums[i]);
		max_num[i] = max_n;
	}
	for (int i = 0; i < n - 2; i++) {
		for (int j = i + 1; j < n - 1; j++) {
			if (nums[j] < nums[i]) {
				int x = nums[i] - nums[j];
					max_diff = x;
					max_k = max_num[j + 1];
					long long k = (long long)max_diff * (long long)max_k;
                    ans = max(ans, k);
			}
		}
	}
        return ans;
    }
};