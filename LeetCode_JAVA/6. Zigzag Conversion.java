// Solution 1 : using String Array
class Solution {
    public String convert(String s, int numRows) {
        String[] str = new String[numRows];
 
        int idx = 0;
        int k = 1;
        if(numRows == 1){
            return s;
        }
        for(int i=0; i<s.length(); i++){
            if(str[idx]==null){
                str[idx] = String.valueOf(s.charAt(i)); 
            }
            else{
                str[idx] += String.valueOf(s.charAt(i));
            }
            if(idx==0){
                k=1;
            }
            else if(idx==numRows-1){
                k=-1;
            }
            idx+=k;
        }
        
        String st = "";
        for(int i=0; i<numRows; i++){
            if(str[i] != null){
                st+=str[i];
            }
        }
        return st;
    }
}








// Solution 1 : using StringBuilder
class Solution {
    public String convert(String s, int numRows) {
        if (numRows<=1) return s;
        
        StringBuilder[] sb= new StringBuilder[numRows];
        for (int i=0; i<numRows; i++) sb[i]=new StringBuilder();
        
        int idx=0;
        int k=1;
        
        for (char c: s.toCharArray()){
            sb[idx].append(c);
            if (idx==0) k=1;
            if (idx==numRows-1) k=-1;
            idx+=k;
        }
        return String.join("", sb);
    }
}
