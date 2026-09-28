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
    int fun(TreeNode tptr)
    {
        if(tptr==null) return 0;
        if (tptr.left == null)
            return 1 + fun(tptr.right);
        if (tptr.right == null)
            return 1 + fun(tptr.left);
        int left_depth=fun(tptr.left);
        int right_depth=fun(tptr.right);
        return 1+Math.min(left_depth,right_depth); 
    }
    public int minDepth(TreeNode root) {
        int depth=fun(root);
        return depth;
    }
}