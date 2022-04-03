// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int A[][])
    {
        // code here
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int row = 0;
            int col = i;
            while(row<n && col>=0){
                ls.add(A[row][col]);
                row++;
                col--;
            }
        } 
        for (int i=1; i<=n-1; i++) {
            int row = i;
            int col = n-1;
            while(row<n && col>=0){
                ls.add(A[row][col]);
                row++;
                col--;
            }
        }return ls;
    }
}
