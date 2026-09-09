class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int key=nums[i];
            if(map.containsKey(key)==false)
                map.put(key,1);
            else
            {
                map.put(key,map.get(key)+1);
            }
        }
        for(int key : map.keySet())
        {
            if(map.get(key)>1)
                return true;
        }
        return false;
    }
}