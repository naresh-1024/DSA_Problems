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
    int fun(TreeNode tptr,boolean []res){
        if(tptr==null) return 0;
        int left_depth=fun(tptr.left,res);
        int right_depth=fun(tptr.right,res);
        int diff=Math.abs(left_depth-right_depth);
        if(diff>1) res[0] = false;
        return 1+Math.max(left_depth,right_depth);
    }
    public boolean isBalanced(TreeNode root) {
        boolean []res = new boolean[1];
        res[0]=true;
        fun(root,res);
        return res[0];
    }
}