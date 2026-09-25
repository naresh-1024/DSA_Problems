class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> que = new LinkedList<>();
        int r_ctr=0;
        int d_ctr=0;
        for(int i=0;i<senate.length();i++)
     {
        que.offer(senate.charAt(i));
        if(senate.charAt(i)=='R') r_ctr++;
        else d_ctr++;
     }
        int r_rem=0;
        int d_rem=0;
        while(d_ctr>0&&r_ctr>0)
        {
            char deq_ch=que.poll();
            if(deq_ch=='D')
            {   
                if(d_rem==0)
                {
                    r_rem++;
                    que.offer(deq_ch);
                }
                else
                {
                    d_rem--;
                    d_ctr--;
                }
            }
            else
            {
                if(r_rem==0)
                {
                    d_rem++;
                    que.offer(deq_ch);
                }
                else
                {
                    r_rem--;
                    r_ctr--;
                }
            }
        }

       if(d_ctr!=0) return "Dire";
        else return "Radiant";
    }
}