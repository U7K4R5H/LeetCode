class Solution {
    public int lastStoneWeight(int[] stones) {
        //Simulate the process. We can do it with a heap, or by sorting some list of stones every time we take a turn.
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : stones) {
            pq.add(i);
        }
        while(pq.size()>1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1 != s2) {
                pq.add(s1-s2);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}