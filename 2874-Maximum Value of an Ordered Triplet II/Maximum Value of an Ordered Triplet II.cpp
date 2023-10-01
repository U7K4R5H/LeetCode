class Solution {
    public: long long maximumTripletValue(vector < int > & nums) {
	int n = nums.size();
	vector<int> max_left(n);
	vector<int> max_right(n);
	int max_n = INT_MIN;
	long long ans = INT_MIN;

	for (int i = n - 1; i >= 0; i--) {
		max_n = max(max_n, nums[i]);
		max_right[i] = max_n;
	}

	max_n = INT_MIN;

	for (int i = 0; i < n; i++) {
		max_n = max(max_n, nums[i]);
		max_left[i] = max_n;
	}


	for (int j = 1; j < n - 1; j++) {
		int a = max_left[j - 1] - nums[j];
		int b = max_right[j + 1];
		long long k = (long long)a * (long long)b;
		ans = max(ans, k);
	}
	
	if (ans < 0) {return 0;}
	else {return ans;}
		}
};