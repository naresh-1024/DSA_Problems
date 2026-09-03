class Solution {
    public boolean uniformArray(int[] nums1) {
        int m=nums1[0];
        boolean odd=false;
        for(int i:nums1){
            if(i<m){
                m=i;
            }
            if((i&1)==1)
                odd=true;       
        }
        if((m&1)==1)
            return true;
        return !odd;
    }
}