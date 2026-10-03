/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        TreeNode deq = root;
        que.offer(deq);
        while(!que.isEmpty()){
            int lev = que.size();
            long sum=0;
            for(int i=0;i<lev;i++){
                deq=que.poll();
                sum+=deq.val;
                if(deq.left!=null)
                    que.offer(deq.left);
                if(deq.right!=null)
                    que.offer(deq.right);
            }
            res.add((double)sum/lev);
        }
        return res;
    }
}