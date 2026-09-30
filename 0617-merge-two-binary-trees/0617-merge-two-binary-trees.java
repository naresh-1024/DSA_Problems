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
    void fun(TreeNode tptr1,TreeNode tptr2){
        if(tptr1==null && tptr2==null) return;
        tptr1.val=tptr1.val+tptr2.val;
        if(tptr1.left==null && tptr2.left!=null){
            tptr1.left=tptr2.left;
            tptr2.left=null;
        }
        if(tptr1.right==null && tptr2.right!=null){
            tptr1.right=tptr2.right;
            tptr2.right=null;
        }
        if(tptr1.left!=null && tptr2.left!=null)
            fun(tptr1.left,tptr2.left);
        if(tptr1.right!=null && tptr2.right!=null)
            fun(tptr1.right,tptr2.right);
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        fun(root1,root2);
        return root1;
    }
}