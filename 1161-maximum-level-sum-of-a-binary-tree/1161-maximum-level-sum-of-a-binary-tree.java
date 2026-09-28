class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        int max_sum = Integer.MIN_VALUE;
        int res = 1;
        int level = 1;

        while (!que.isEmpty()) {

            int size = que.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode deq = que.poll();
                sum += deq.val;

                if (deq.left != null)
                    que.offer(deq.left);

                if (deq.right != null)
                    que.offer(deq.right);
            }
            if (sum > max_sum) {
                max_sum = sum;
                res = level;
            } 
            level++;
        }

        return res;
    }
}