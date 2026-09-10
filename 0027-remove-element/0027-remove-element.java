class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int idx=0;idx<nums.length;idx++)
        {
            if(nums[idx]!=val)
                nums[i++]=nums[idx];
        }
        return i;
    }
}