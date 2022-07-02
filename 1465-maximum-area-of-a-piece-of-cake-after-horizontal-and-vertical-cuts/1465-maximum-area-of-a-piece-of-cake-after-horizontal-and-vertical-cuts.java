class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        return (int)(1L * getMax(h, horizontalCuts) * getMax(w, verticalCuts) % 1000000007 );
    }
    public int getMax(int x, int[] arr) {
        sort(arr);
        int n =arr.length;
        int max = Math.max(arr[0], x - arr[n - 1]);
        for(int i=1; i<n; i++)
            max = Math.max(max, arr[i] - arr[i - 1]);
        return max;
    }
    public void sort(int[] arr) { // can skip this implementation
        //because Arrays.sort() uses quicksort which is dumb
        //Collections.sort() uses merge sort
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int x: arr)
            ls.add(x);
        Collections.sort(ls);
        for(int i=0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }
}