class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        boolean [] bool = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
            bool[i]=false;
        int j=0;
        int []res =new int[2];
        for(int i=0;i<nums.length;i++){
            if(bool[nums[i]]==false)
            bool[nums[i]]=true;
            else
                res[j++]=nums[i];
        }
        return res;
    }
}