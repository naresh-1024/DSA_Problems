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
import java.util.*;
class Solution {
    void fun(TreeNode tptr, int target, int sum,List<Integer> path, List<List<Integer>> res) {
        if (tptr == null)
            return;
        sum += tptr.val;
        path.add(tptr.val);
        if (tptr.left == null && tptr.right == null) {
            if (sum == target) {
                res.add(new ArrayList<>(path));
            }
        }
        fun(tptr.left, target, sum, path, res);
        fun(tptr.right, target, sum, path, res);
        path.remove(path.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        fun(root, targetSum, 0, path, res);
        return res;
    }
}