class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        long st=2;
        long end=num/2;
        while(st<=end)
        {
            long mid=(st+end)/2;
            long sq=mid*mid;
            if(sq==num)
                return true;
            else if(sq<num)
                st=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}