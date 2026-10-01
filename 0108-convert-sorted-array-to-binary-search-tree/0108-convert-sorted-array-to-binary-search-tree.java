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
    TreeNode fun(int []arr,int st,int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        TreeNode mid_node=new TreeNode(arr[mid]);
        mid_node.left=fun(arr,st,mid-1);
        mid_node.right=fun(arr,mid+1,end);
        return mid_node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return fun(nums,0,nums.length-1);
    }
}