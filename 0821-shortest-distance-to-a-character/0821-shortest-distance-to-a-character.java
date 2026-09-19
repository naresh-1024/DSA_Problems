class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int []res=new int[n];
        int curr=-n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                curr=i;
            }
            res[i]=i-curr;
        }
        curr=2*n;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
                curr=i;
            res[i]=Math.min(res[i],curr-i);
        }
        return res;
    }
}