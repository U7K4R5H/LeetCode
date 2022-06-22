class Solution {
 /*   public void merge(int[] nums1, int m, int[] nums2, int n) {
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
    } */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n != 0 && m != 0) {
    
        for(int i=0; i<m; i++) {
            if(nums1[i] > nums2[0]) {
                swap(nums1, nums2, i, 0);
                int curr = nums2[0];
                int k;
                for(k=1; k<n && nums2[k]<curr; k++) {
                    nums2[k - 1] = nums2[k];
                }
                nums2[k - 1] = curr;
            }
        }
         for(int x=0; x<n; x++) {
            nums1[m+x] = nums2[x];
        }
        }
        if(m == 0 && n != 0) {
            for(int x=0; x<n; x++) {
                nums1[m+x] = nums2[x];
            }
        }
    }
    public void swap(int a[], int b[], int i, int j) {
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}