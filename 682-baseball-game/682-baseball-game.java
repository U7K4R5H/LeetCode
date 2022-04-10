class Solution {
    public int calPoints(String[] ops) {
        
        ArrayList<Integer> scoreList = new ArrayList<Integer>();
        int scoreListIndex = 0;
        int sum = 0;
        
        for(int i=0; i<ops.length; i++) {
            String s = ops[i];
            if(s.equals("+")) {
                scoreList.add(scoreList.get(scoreListIndex-1) + scoreList.get(scoreListIndex-2));
                scoreListIndex++;
            }
            else if(s.equals("D")) {
                scoreList.add(2 * scoreList.get(scoreListIndex-1));
                scoreListIndex++;
            }
            else if(s.equals("C")) {
                scoreList.remove(scoreListIndex - 1);
                scoreListIndex--;
            }
            else {
                scoreList.add(Integer.parseInt(ops[i]));
                scoreListIndex++;
            }
        }
        for(int x : scoreList) {
            sum += x;
        }
        return sum;
    }
}
