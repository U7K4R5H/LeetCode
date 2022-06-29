// Recursion with Memoization TopDown approach
class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][]dp=new int[m][n];
        
        for(int[] dp1:dp)
            Arrays.fill(dp1,-1);
        
        return countPaths(0, 0, m, n, dp);
    }
    public int countPaths(int i, int j, int m, int n, int[][] dp) {
        
        if(i == (m - 1) && j == (n - 1)) return 1;
        
        else if (i >= m || j >= n) return 0;
        
        else if(dp[i][j] != -1) return dp[i][j];
        
        else return dp[i][j] = countPaths(i + 1, j, m, n, dp) + countPaths(i, j + 1, m, n, dp);
    }
}