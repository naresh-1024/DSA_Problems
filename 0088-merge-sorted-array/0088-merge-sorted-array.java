class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_idx=m-1;
        int nums2_idx=n-1;
        int inc_idx=m+n-1;
        while(nums2_idx >= 0)
        {
            if(nums1_idx>=0 && nums1[nums1_idx] > nums2[nums2_idx])
            {
                nums1[inc_idx]=nums2[nums1_idx];
                nums1_idx--;
            }
            else
            {
                nums1[inc_idx] = nums2[nums2_idx];
                nums2_idx--;
            }
            inc_idx--;
        }
    }
}