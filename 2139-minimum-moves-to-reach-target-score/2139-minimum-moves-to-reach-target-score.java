class Solution {
    public int minMoves(int target, int maxDoubles) {
        
        int count = 0;
        //Solve the opposite problem: start at the given score and move to 1.
        while(target != 1) {
            
            if(target % 2 == 0 && maxDoubles > 0) {  //greedy
                target /= 2;
                maxDoubles--;
                count++;
            }
            else if(target % 2 == 1 && maxDoubles > 0) {
                target -= 1;
                count++;
            }
            else if(maxDoubles == 0) {   //why iterate? use break be smart
                target -= 1;
                count += target;
                break;
            }
        }
        return count;
    }
}