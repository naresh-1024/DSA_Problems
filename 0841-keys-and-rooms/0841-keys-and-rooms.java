class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> que = new LinkedList<>();
        boolean []vis = new boolean[rooms.size()];
        que.offer(0);
        vis[0]=true;
        while(!que.isEmpty()){
            Integer deq=que.poll();
            for (int i = 0; i < rooms.get(deq).size(); i++) {
            int work_vert = rooms.get(deq).get(i);
            if (vis[work_vert] == false) {
                vis[work_vert] = true;
                que.offer(work_vert);
            }
        }
        }
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false)
                return false;
        }
        return true;
    }
}