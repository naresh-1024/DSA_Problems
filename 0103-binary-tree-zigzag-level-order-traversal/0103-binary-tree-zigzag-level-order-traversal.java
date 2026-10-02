class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        TreeNode deq_node = root;
        que.offer(deq_node);
        boolean resbool = true;
        while(!que.isEmpty()) {
            int lev = que.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < lev; i++) {
                deq_node = que.poll();
                temp.add(deq_node.val);
                if(deq_node.left != null)
                    que.offer(deq_node.left);

                if(deq_node.right != null)
                    que.offer(deq_node.right);
            }
            if(!resbool) {
                Collections.reverse(temp);
            }
            res.add(temp);
            resbool = !resbool;
        }
        return res;
    }
}