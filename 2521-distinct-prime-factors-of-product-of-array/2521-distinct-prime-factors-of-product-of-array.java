class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int pf=2;
            while(nums[i]%2==0)
            {
                set.add(pf);
                nums[i]/=2;
            }
            for(pf=3;(long)pf*pf<=nums[i];pf+=2){
                while(nums[i]%pf==0){
                    set.add(pf);
                    nums[i]/=pf;
                }
            }
            if(nums[i] > 1)         
                set.add(nums[i]);
        }
        return set.size();
    }
}