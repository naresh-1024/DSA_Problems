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
    int sum=0;
    int fun(TreeNode tptr,int low,int high){
        if(tptr==null) return 0;
        if(tptr.val<=high && tptr.val>=low){
            sum=sum+tptr.val;
        }
        fun(tptr.left,low,high);
        fun(tptr.right,low,high);
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        fun(root,low,high);
        return sum;
    }
}