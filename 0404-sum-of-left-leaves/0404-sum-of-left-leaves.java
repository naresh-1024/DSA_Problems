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
    int fun(TreeNode tptr,TreeNode parent){
        if(tptr==null) return 0;
        if(tptr.left==null && tptr.right==null){
            if(parent!=null && parent.left==tptr){
                return tptr.val;
            }
            return 0;
        }
        int left_sub_sum=fun(tptr.left,tptr);
        int right_sub_sum=fun(tptr.right,tptr);
        return right_sub_sum+left_sub_sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root,null);
    }
}