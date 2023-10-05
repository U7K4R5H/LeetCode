/* TC:- O(n), SC:- O(n)
 class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int, int> umap;

        int n = nums.size();
        int f = floor(n / 3);

        for (int i = 0; i < n; i++) {

            if (umap.find(nums[i]) == umap.end()) //key not found
                umap[nums[i]] = 1;
            else
                umap[nums[i]]++;
        }

        for (auto& it : umap) {
            if (it.second > f)
                ans.push_back(it.first);
        }
        return ans;
    }
}; 
See below code for Moore’s Voting Algorithm for N/3
*/
class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {

        vector<int> ans;
        int element1(-1), element2(-1), freq1(0), freq2(0);

        for(int num : nums) {

            if(num == element1) freq1++;

            else if(num == element2) freq2++;

            else if(freq1 == 0) {
                element1 = num;
                freq1++;
            }

            else if(freq2 == 0) {
                element2 = num;
                freq2++;
            }

            else { // Ultimate else block
                freq2--;
                freq1--;
            }
        }

        freq1 = freq2 = 0;

        for(int num : nums) {

            if(element1 == num) freq1++;

            else if(element2 == num) freq2++;
        }

        if(freq1 > nums.size()/3) ans.push_back(element1);

        if(freq2 > nums.size()/3) ans.push_back(element2);

        return ans;
    }
};