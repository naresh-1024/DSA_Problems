class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(map.containsKey(key)==false)
                map.put(key,1);
            else
            {
                int count=map.get(key);
                int up_count=count+1;
                map.put(key,up_count);
            }
        }
        int res=0;
        for(int key : map.keySet())
        {
            if(map.containsKey(key+1)==true)
            {
                int horm=map.get(key)+map.get(key+1);
                if(horm>res) 
                    res=horm;
            }
        }
        return res;
    }
}