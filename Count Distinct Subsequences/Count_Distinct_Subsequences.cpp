//Implemented this Video Solution ==> https://youtu.be/9UEHPiK53BA?si=5aXjCQBYumUvh2QS
#include <bits/stdc++.h>
class Solution {
public:
    int distinctSubseqII(string s) {
        int mod = 1e9 + 7;
        unordered_map<char, int> umap;
        int n = s.length();

        long long dp[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {

            dp[i] = (2 * dp[i - 1]) % mod;

            char ch = s[i - 1];

            if (umap.find(ch) != umap.end()) {
                int j = umap.at(ch);
                dp[i] = (dp[i] - dp[j - 1] + mod)% mod;
            }

            umap[ch] = i;
        }
        return (dp[n] - 1 + mod) % mod;
    }
};