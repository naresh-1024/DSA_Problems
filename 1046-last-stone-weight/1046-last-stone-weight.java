class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            heap.offer(stones[i]);
        }
        int max1;
        int max2;
        while(heap.size()>1){
            max1=heap.poll();
            max2=heap.poll();
            if(max1!=max2)
                heap.offer(max1-max2);
        }
        if(heap.isEmpty()) return 0;
        return heap.poll();
    }
}