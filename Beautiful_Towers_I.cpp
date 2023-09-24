class Solution {
  public: long long solve(int mx, int max_index, vector < int > maxHeights) {

    vector < int > heights(maxHeights.size(), 0);

    heights[max_index] = mx;

    int left = max_index - 1, right = max_index + 1;

    while (left >= 0) {
      if (maxHeights[left] > heights[left + 1]) {
        heights[left] = heights[left + 1];
        left--;
      } else {
        heights[left] = maxHeights[left];
        left--;
      }
    }

    while (right <= heights.size() - 1) {
      if (maxHeights[right] > heights[right - 1]) {
        heights[right] = heights[right - 1];
        right++;
      } else {
        heights[right] = maxHeights[right];
        right++;
      }
    }

    long long ans = 0;

    for (int i = 0; i < heights.size(); i++) {
      ans += (long long) heights[i];
    }
    return ans;
  }
  long long maximumSumOfHeights(vector < int > & maxHeights) {

    long long max_ans = 0;

    for (int i = 0; i < maxHeights.size(); i++) {
      max_ans = max(solve(maxHeights[i], i, maxHeights), max_ans);
    }
    return max_ans;
  }
};

/*

Question Link ==> https://leetcode.com/problems/beautiful-towers-i

[NOTES]
Why my original solution failed for this problem.

Consider this example
[5,2,4,4]
my mountain array is {5 2 2 2} therefore sum = 11 but it is *wrong*. correct answer is 12.
my solution assumes that maximum sum of mountain height will allways contain the maximium peak value, ie '5' in the above case,
but now see the below example where I did not take maximum peak but took 2nd last '4' then the mountain array is
[2 2 4 4], hence max sum is '12'.

So therefore for every index of maxheigh we need to find the mountain and return the maximum value of total height of it.
It is a brute fource solutuion in O(n^2).

Old code i.e my approach
long long maximumSumOfHeights(vector<int>& maxHeights) {

		vector<int> max_indicies;

		int mx = INT_MIN;

		long long max_ans = 0;

		for (int i = 0; i < maxHeights.size(); i++) { //Find Peak Value of the mountain
			if (maxHeights[i] > mx) {
				mx = maxHeights[i]; 
			}
		}

		for (int i = 0; i < maxHeights.size(); i++) {
			if (maxHeights[i] == mx) {
				max_indicies.push_back(i);
			}
		}

		for (int i : max_indicies) {
			max_ans = max(solve(mx, i, maxHeights), max_ans);
		}

		return max_ans;
  }
*/
