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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
         if (root == null) {
            return res;
        }
        TreeNode deq=root;
        que.offer(deq);
        int sum=0;
        while(!que.isEmpty()){
            int curr_lev=que.size();
            sum=Integer.MIN_VALUE;
            for(int i=0;i<curr_lev;i++){
                deq=que.poll();
                sum=Math.max(deq.val,sum);
                if(deq.left!=null)
                    que.offer(deq.left);
                if(deq.right!=null)
                    que.offer(deq.right);
            }
            res.add(sum);
        }
        return res;
    }
}