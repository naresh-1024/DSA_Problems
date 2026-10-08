class Solution {
    int fun(int []in_deg){
        for(int i=0;i<in_deg.length;i++){
            if(in_deg[i]==0){
                in_deg[i]=-1;
                return i;
            }
        }
        return -1;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int []in_deg = new int [numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int task1=prerequisites[i][0];
            int task2=prerequisites[i][1];
            in_deg[task1]++;
        }
        int count=0;
        while(true){
            int zero_ctr=fun(in_deg);
            if(zero_ctr==-1) break;
            count++;
            for(int i=0;i<prerequisites.length;i++){
                int task1=prerequisites[i][0];
                int task2=prerequisites[i][1];
                if(task2==zero_ctr)
                    in_deg[task1]--;
            }
        }
        return count==numCourses;
    }
}