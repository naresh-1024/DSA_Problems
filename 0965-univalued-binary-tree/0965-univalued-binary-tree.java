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
    boolean fun(TreeNode tptr, int val) {
        if (tptr == null) return true;
        if (tptr.val != val) return false;
        return fun(tptr.left, val) && fun(tptr.right, val);
    }
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return fun(root, root.val);
    }
}