class Solution {
public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost1>total&&cost2>total){
            return 1;
        }
        long sum=0;
        int pen_count=0;
        int pencil_count=0;
        
        while(pen_count*cost1<=total){
            pencil_count=(total-(pen_count*cost1))/cost2;
            sum += pencil_count + 1;
            pen_count++;
        }
        return sum;
    }
}