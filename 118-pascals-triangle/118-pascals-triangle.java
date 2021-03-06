/*
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        int ar[][] = sol(numRows);
        
        		for(int i=0; i<ar.length; i++ ) {
                    List<Integer> ls=new ArrayList<>();
			for(int j=0; j<=i; j++) {
                ls.add(ar[i][j]);
                    }
                res.add(ls);
            }
        return res;
    }
    public static int[][] sol(int n) {
		
	    int A[][] = new int[n][n];
		
		for(int i=0; i<n; i++ ) {
			for(int j=0; j<=i; j++) {
				if(j==i) {
					A[i][j] = 1;
				}
				else {
					if(i>0 && j>0) {
						A[i][j] = A[i-1][j] + A[i-1][j-1];
					}
				}
				A[i][0] = 1;
			}
		}
		
		return A;
	}
} 
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
    }
}