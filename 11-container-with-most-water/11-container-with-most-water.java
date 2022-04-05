class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int max_area=0;
        while(left<right) {
            int w = right-left;
            int h = Math.min(height[left], height[right]);
            int area = w*h;
            max_area = Math.max(area, max_area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }

        }
        return max_area;
    }
}