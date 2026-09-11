class Solution {
    public int minStartValue(int[] nums) {
        int res=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res=Math.min(sum,res);
        }
        if(res<0)
            return Math.abs(res)+1;
        return 1;
    }
}