class Solution {
    void fun(int []arr,int idx,List<Integer> seq,List<List<Integer>> res){
        if(idx==arr.length) {
            res.add(new ArrayList<Integer>(seq));
            return;
        }
        fun(arr,idx+1,seq,res);
        seq.add(arr[idx]);
        fun(arr,idx+1,seq,res);
        seq.remove(seq.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> seq = new LinkedList<>();
        fun(nums,0,seq,res);
        return res;
    }
}