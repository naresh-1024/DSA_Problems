class Solution {
    public String mostCommonWord(String str, String[] banned) {
        str.toLowerCase();
        str = str.toLowerCase();
        String[] words = str.split("[ ,.? !;']+");

        HashSet<String> ban = new HashSet<>();

        for(int i=0;i<banned.length;i++){
            ban.add(banned[i]);
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            if(!ban.contains(words[i]))
                map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        int max_oc=0;
        String res="";
        for(String key : map.keySet())
        {
            if(map.get(key) > max_oc){
                max_oc = map.get(key);
                res = key;
            }
        }

       return res;
    }
}