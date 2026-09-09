class Solution {
    long exp_cal(long base,long exp)
    {
        if(exp==0) return 1;
        if(exp==1) return base;
        long half_exp=exp/2;
        long half_res=1;
        half_res=exp_cal(base,half_exp);
        long full_res=(half_res*half_res)%1000000007;
        if(exp%2==1)
            full_res=(full_res*20)%1000000007;
        return full_res;
    }
    public int countGoodNumbers(long n) {
        long res=1;
        long half=n/2;
        if(n%2==1)
            res=5;
        res=(res*exp_cal(20,half))%1000000007;
        return (int)res;
    }
}