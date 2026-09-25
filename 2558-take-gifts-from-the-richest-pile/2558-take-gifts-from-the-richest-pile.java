class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            heap.offer(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int val=heap.poll();
            heap.offer((int)Math.sqrt(val));
        }
        long sum=0;
        while(!heap.isEmpty()){
            sum+=heap.poll();
        }
        return sum;
    }
}