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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int curr_lev=que.size();
            List<Integer> dummy = new ArrayList<>();
            for(int i=0;i<curr_lev;i++){
                TreeNode deq = que.poll();
                dummy.add(deq.val);
                if(deq.left!=null)
                    que.offer(deq.left);
                if(deq.right!=null)
                    que.offer(deq.right);
            }
            res.add(dummy);
        }
        return res;
    }
}