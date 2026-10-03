class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } 
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } 
                else {
                    int count = i - stack.peek();

                    if (count > max_count)
                        max_count = count;
                }
            }
        }
        return max_count;
    }
}