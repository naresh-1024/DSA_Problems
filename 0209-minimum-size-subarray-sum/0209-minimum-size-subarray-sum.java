class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st=0;
        int end=0;
        int res=Integer.MAX_VALUE;
        int win_sum=nums[end];
        while(true)
        {
            if(win_sum<target)
            {
                end++;
                if(end==nums.length) break;
                win_sum+=nums[end];
            }
            else if(win_sum>=target)
            {
                int len=end-st+1;
                if(len<res) res=len;
                win_sum-=nums[st];
                st++;
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        else
            return res;
    }
}