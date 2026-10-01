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
    int max_depth=0;
    int res=0;
    void fun(TreeNode tptr,int depth){
        if(tptr==null) return;
        depth++;
        if(depth>max_depth){
            max_depth=depth;
            res=tptr.val;
        }
        fun(tptr.left,depth);
        fun(tptr.right,depth);
    }
    public int findBottomLeftValue(TreeNode root) {
        fun(root,0);
        return res;
    }
}