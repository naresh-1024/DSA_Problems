class Solution {
    public int longestOnes(int[] nums, int k) {
        int st=0;
        int end=0;
        int max_len=0;
        int zero_count=0;
        if(nums[0]==0) zero_count=1;
        while(true)
        {
            if(zero_count<=k)
            {
                int len=end-st+1;
                if(len>max_len) max_len=len;
                end++;
                if(end==nums.length) break;
                if(nums[end]==0)
                    zero_count++;
            }
            else
            {
                if(nums[st]==0)
                    zero_count--;
                st++;
            }
        }
        return max_len;
    }
}