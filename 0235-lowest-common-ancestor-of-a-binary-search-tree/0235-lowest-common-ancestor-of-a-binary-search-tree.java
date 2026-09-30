/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode tptr=root;
        int val1=p.val;
        int val2=q.val;
        while(tptr!=null){
            if(tptr.val>val1 && tptr.val>val2)
                tptr=tptr.left;
            else if(tptr.val<val1 && tptr.val<val2)
                tptr=tptr.right;
            else
                break;
        }
        return tptr;
    }
}