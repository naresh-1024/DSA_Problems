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
    boolean fun(TreeNode tptr,int target,int sum){
        if(tptr==null) return false;
        sum+=tptr.val;
        if(tptr.left==null && tptr.right==null)
            return sum==target;
        boolean left_sum=fun(tptr.left,target,sum);
        boolean right_sum=fun(tptr.right,target,sum);
        return left_sum || right_sum;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root,targetSum,0);
    }
}