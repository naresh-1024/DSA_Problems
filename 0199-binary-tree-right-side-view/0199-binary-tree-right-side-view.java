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
    void fun(TreeNode tptr,int depth,List<Integer> res){
        if(tptr==null) return;
        depth++;
        if(depth>max_depth){
            max_depth=depth;
            res.add(tptr.val);
        }
        fun(tptr.right,depth,res);
        fun(tptr.left,depth,res);
    }
     public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        fun(root,0,res);
        return res;
    }
}