class Solution {
    public char findKthBit(int n, int k) {
        if(k==1) return '0';
        int len=1;
        for(int i=1;i<=n;i++)
        {
            len=len*2;
        }
        len=len-1;
        int mid=(len/2)+1;
        if(k==mid)
            return '1';
        if(k < mid)
            return findKthBit(n-1,k);
        
        int newk=len-k+1;
        char ans=findKthBit(n-1,newk);
        if(ans=='0')
            return '1';
        else
            return '0';
    }
}
// while(curr.length()<k)
// 	{
// 	for(ind=0;ind<curr.length() ;ind++)	
//  	{
// 	 char ch=curr.charAt(0);//curr[0];
// 	 ch=ch+1;
// 	 if(ch>'z') ch='a';
// 	 newword=newword+ch;
// 	}
// 	curr=curr+newword;
//       }