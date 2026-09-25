class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        for(int p : piles) 
                pq.add(p);

        while(k>0)
            {
                int val = pq.poll();
                val = val - val/2;
                pq.add(val);
                k--;
            }
        for(int value : pq)
                res += value;
        
        return res;
    }
}