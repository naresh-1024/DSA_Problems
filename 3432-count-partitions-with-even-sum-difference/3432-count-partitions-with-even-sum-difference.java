class Solution {
    public int countPartitions(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        int count=0;
        int n=nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            int temp=Math.abs(nums[i]-(nums[n]-nums[i]));
            if(temp%2==0)
                count++;
        }
        return count;
    }
}