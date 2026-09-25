class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++){
            heap.offer(piles[i]);
        }
        for(int i=0;i<k;i++){
            int val=heap.poll();
            val = val - val / 2; 
            heap.offer(val);
        }
        int sum=0;
        while(!heap.isEmpty()){
            sum+=heap.poll();
        }
        return sum;
    }
}