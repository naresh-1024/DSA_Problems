class Solution {
    boolean isvalid(int []nums,long choco,long tot)
    {
        long total=0;
        for(int i=0;total<tot && i<nums.length;i++){
            total+=(nums[i]/choco);
        }
        return total>=tot;
    }
    public int maximumCandies(int[] candies, long k) {
        long total_sum=0;
        for(int i=0;i<candies.length;i++){
            total_sum+=candies[i];
        }
        long avg=total_sum/k;
        if(avg==0) return 0;
        long st=1;
        long end=avg;
        long res=0;
        while(st<=end)
        {
            long mid=(st+end)/2;
            if(isvalid(candies,mid,k)){
                res=mid;
                st=mid+1;
            }
            else
                end=mid-1;
        }
        return (int)res;
    }
}