class Solution {
    String check_word(String s,String str,String prev)
    {
        int s_ind=0;
        int str_ind=0;
        String result="";
        while(s_ind<s.length()&&str_ind<str.length())
        {
            if(s.charAt(s_ind)==str.charAt(str_ind)){
                s_ind++;
                str_ind++;
            }
            else
                s_ind++;
        }
        if(str.length()==str_ind){
            result=str;
            if(str.length()>prev.length())
                return str;
            if(str.length() == prev.length() && (result.compareTo(prev)<0))
                return result;
            return prev;
        }
        else
            return prev;
        
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String result="";
        for(int i=0;i<dictionary.size();i++){
            result=check_word(s,dictionary.get(i),result);
        }
        return result;
    }
}