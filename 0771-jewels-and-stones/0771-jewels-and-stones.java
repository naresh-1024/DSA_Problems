class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i=0;i<stones.length();i++)
        {
            char key = stones.charAt(i);
            if(map.containsKey(key)==false)
                map.put(key,1);
            else
            {
                map.put(key,map.get(key)+1);
            }
        }
        int res=0;
        for(int i=0;i<jewels.length();i++)
        {
            char key=jewels.charAt(i);
            if(map.containsKey(key)==true){
                res=res+map.get(key);
            }
        }
        return res;
    }
}