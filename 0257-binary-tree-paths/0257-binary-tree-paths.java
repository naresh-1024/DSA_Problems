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
    void fun(TreeNode tptr,String path,List<String> res){
        if(tptr==null) return;
        if(tptr.left==null && tptr.right==null){
            path=path+tptr.val;
            res.add(path);
            return;
        }
        path=path+tptr.val+"->";
        fun(tptr.left,path,res);
        fun(tptr.right,path,res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        fun(root,"",res);
        return res;
    }
}