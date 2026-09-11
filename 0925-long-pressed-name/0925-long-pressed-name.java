class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int name_ind=0;
        int typ_ind=0;
        if(name.charAt(name_ind++)!=typed.charAt(typ_ind++))
            return false;
        while(name_ind<name.length() && typ_ind<typed.length())
        {
            if(name.charAt(name_ind)==typed.charAt(typ_ind)){
                name_ind++;
                typ_ind++;
            }
            else
            {
                if(typed.charAt(typ_ind)==typed.charAt(typ_ind-1))
                    typ_ind++;
                else
                    return false;
            }
        }
        while(typ_ind<typed.length())
        {
            if(typed.charAt(typ_ind)==typed.charAt(typ_ind-1))
                typ_ind++;
            else
                return false;
        }
        if(name_ind==name.length() && typ_ind==typed.length())
            return true;
        return false;
    }
}