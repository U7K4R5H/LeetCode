class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int cnt = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1])); // Sort using 2nd index in decending order
        for(int[] x : boxTypes) {
            if(truckSize >= x[0]) {
                cnt += x[0] * x[1];
                truckSize -= x[0];
            } else {
                cnt += truckSize * x[1];
                return cnt;
            }
        }
        return cnt;
    }
}