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
    HashSet<Integer> set = new HashSet<>();
    boolean fun(TreeNode tptr, int k) {
        if (tptr == null) return false;
        if (set.contains(k - tptr.val)) return true;
        set.add(tptr.val);
        return fun(tptr.left, k) || fun(tptr.right, k);
    }
    public boolean findTarget(TreeNode root, int k) {
        set.clear();
        return fun(root, k);
    }
}