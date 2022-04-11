class Solution {
public List<List<Integer>> shiftGrid(int[][] grid, int k) {
int m=grid.length,n=grid[0].length;
List<List<Integer>> res=new ArrayList<>();
while(k-->0){
int temp=grid[m-1][n-1];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
int x=grid[i][j];
grid[i][j]=temp;
temp=x;
}
}
}
for(int i=0;i<m;i++){
List<Integer> ls=new ArrayList<>();
for(int j=0;j<n;j++){
ls.add(grid[i][j]);
}
res.add(ls);
}
return res;
}

}