class Solution {
    public int findJudge(int n, int[][] trust) {
        int []in_deq = new int[n+1];
        int []out_deq = new int[n+1];
        for(int i=0;i<trust.length;i++){
            int from = trust[i][0];
            int to = trust[i][1];
            in_deq[to]++;
            out_deq[from]++;
        }
        for(int i=1;i<=n;i++){
            if(in_deq[i]==n-1 && out_deq[i]==0)
                return i;
        }
        return -1;
    }
}