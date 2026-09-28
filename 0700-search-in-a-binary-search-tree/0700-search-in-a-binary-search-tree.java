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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode tptr=root;
        while(tptr!=null){
            if(tptr.val<val){
                tptr=tptr.right;
            }
            else if(tptr.val>val){
                tptr=tptr.left;
            }
            else{
                break;
            }
        }
        return tptr;
    }
}