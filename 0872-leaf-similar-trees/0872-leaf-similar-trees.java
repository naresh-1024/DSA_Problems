class Solution {

    static void fun(TreeNode tptr, ArrayList<Integer> list) {

        if (tptr == null)
            return;
        if (tptr.left == null && tptr.right == null) {
            list.add(tptr.val);
            return;
        }
        fun(tptr.left, list);
        fun(tptr.right, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        fun(root1, list1);
        fun(root2, list2);

        return list1.equals(list2);
    }
}