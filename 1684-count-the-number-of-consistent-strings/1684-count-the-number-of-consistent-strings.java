class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet <Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++)
            set.add(allowed.charAt(i));
        int res_count=0;
        for(int i=0;i<words.length;i++)
        {
            String curr_word=words[i];
            boolean res_flag=true;
            for(int j=0;j<curr_word.length();j++){
                char ch=curr_word.charAt(j);
                if(set.contains(ch)==false)
                    res_flag=false;
            }
            if(res_flag==true)
                res_count++;
        }
        return res_count;
    }
}