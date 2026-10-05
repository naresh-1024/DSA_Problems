/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<Node> que = new LinkedList<>();
        Node deq_node=root;
        que.offer(deq_node);
        while(!que.isEmpty()){
            int lev=que.size();
            List<Integer> curr = new ArrayList<>();
            for(int i=0;i<lev;i++){
                deq_node=que.poll();
                curr.add(deq_node.val);
                for(int j=0;j<deq_node.children.size();j++)
                    que.offer(deq_node.children.get(j));
            }
            res.add(curr);
        }
        return res;
    }
}