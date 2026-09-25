class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            heap.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int val=heap.remove();
            heap.add((int)Math.sqrt(val));
        }
        long sum=0;
        while(!heap.isEmpty()){
            sum+=heap.remove();
        }
        return sum;
    }
}