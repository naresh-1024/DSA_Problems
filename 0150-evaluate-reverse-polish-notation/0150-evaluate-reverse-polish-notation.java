class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr=tokens[i];
            char ch=curr.charAt(0);
            if(ch=='+' && curr.length()==1){
                int val1=stack.pop();
                int val2=stack.pop();
                stack.push(val2+val1);
            }
            else if(ch=='-' && curr.length()==1){
                int val1=stack.pop();
                int val2=stack.pop();
                stack.push(val2-val1);
            }
            else if(ch=='*' && curr.length()==1){
                int val1=stack.pop();
                int val2=stack.pop();
                stack.push(val2*val1);
            }
            else if(ch=='/' && curr.length()==1){
                int val1=stack.pop();
                int val2=stack.pop();
                stack.push(val2/val1);
            }
            else{
                stack.push(Integer.parseInt(curr));
            }
        }
        return stack.pop();
    }
}