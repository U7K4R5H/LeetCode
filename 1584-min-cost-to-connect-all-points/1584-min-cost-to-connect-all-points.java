class Solution {
    public int minCostConnectPoints(int[][] points) {
        int cost = 0;
        int n = points.length;
        int[] distance = new int[n];
        int next = 0;
        
        for (int i = 1; i < n; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        
        for (int k = 1; k < n; k++) {
            int point = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                if (distance[i] > 0) {
                    distance[i] = Math.min(distance[i], Math.abs(points[i][0] - points[next][0]) + Math.abs(points[i][1] - points[next][1])); 
                    
                    if (min > distance[i]) {
                        min = distance[i];
                        point = i;
                    }
                }
            }
            
            next = point;
            distance[point] = 0;
            cost += min;
        }
        
        return cost;
    }
}