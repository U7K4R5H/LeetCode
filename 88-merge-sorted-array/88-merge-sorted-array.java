class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while( i<m && j<n ) {
            if(nums1[i] <= nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                swap(nums1, nums2, i, j);
                int curr = j;
                while(curr<n-1 && nums2[curr]>nums2[curr+1]) {
                    swap(nums2, nums2, curr, curr+1);
                    curr++;
                }
                    i++;
            }
        }
        for(int x=0; x<n; x++) {
            nums1[m+x] = nums2[x];
        }
    }
    public void swap(int a[], int b[], int i, int j) {
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}