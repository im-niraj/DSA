// Approch 1

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        
        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            boolean f =false;
            for(int j=0; j<strs.length ; j++){
                if(i < strs[j].length() && c == strs[j].charAt(i)){
                    f=true;
                }
                else{
                    f=false;
                    break;
                }
            }
            if(f)s+=c;
            else break;
        }
        return s;
    }
}


// -----------------------------------------------------
// Approch 2

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        
        for(int i=1; i<strs.length; i++){
            String temp = "";
            for(int j=0; j<strs[i].length() && j<prefix.length(); j++){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                
                temp+=prefix.charAt(j);
            }
            prefix = temp;
        }
        
        return prefix.length()>0 ? prefix : "";
    }
}
