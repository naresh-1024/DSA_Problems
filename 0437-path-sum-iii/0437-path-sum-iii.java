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
    int fun(TreeNode tptr, long target) {
        if (tptr == null)
            return 0;
        int count = 0;
        if (tptr.val == target)
            count++;
        count += fun(tptr.left, target - tptr.val);
        count += fun(tptr.right, target - tptr.val);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        int count = 0;
        count += fun(root, targetSum);
        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);
        return count;
    }
}