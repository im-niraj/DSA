// Approch No 1
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int idx=0;
        int count=0;
        for(int i=0; i<words.length; i++){
            if(idx<s.length()) count +=words[i].length();
            for(int j=0; j<words[i].length(); j++){
                if(idx<s.length()){
                    if(s.charAt(idx)==words[i].charAt(j)) idx++;
                    else return false;
                }
            }
        }
        return idx==s.length() && idx==count? true : false;
    }
}

/*
1. every index value of words should be equal to s e.g. s = "a", words[0] = "aa".  this is false 
2. the we check if s.length() == words[i].length() and every character should be equal
3. if words all elements values length is less then s.length() then return false else return true
*/

/* ------------------------------------------------------------------------------------------------ */

// Approch No 2
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str = "";
        
        for(String word : words){
            if(str.length() < s.length()){
                str+=word;
            }
        }
        
        return str.equals(s) ? true : false;
    }
}

/*
1. concatenate every element of the words array until new string is less then s
2. return true if new string and s are equal else false
*/
