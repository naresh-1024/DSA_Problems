import java.util.*;

class Solution {
    boolean res = false;
    void fun(ArrayList<Integer>[] mat, int work_vert, int des, boolean[] vis) {
        if (work_vert == des) {
            res = true;
            return;
        }
        vis[work_vert] = true;
        ArrayList<Integer> conn_al = mat[work_vert];
        for (int i = 0; i < conn_al.size(); i++) {
            int conn_vert = conn_al.get(i);
            if (!vis[conn_vert]) {
                fun(mat, conn_vert, des, vis);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        res = false;
        boolean[] vis = new boolean[n];
        ArrayList<Integer>[] mat = new ArrayList[n];
        for (int i = 0; i < n; i++)
            mat[i] = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            int vert1 = edges[i][0];
            int vert2 = edges[i][1];
            mat[vert1].add(vert2);
            mat[vert2].add(vert1);
        }
        fun(mat, source, destination, vis);
        return res;
    }
}