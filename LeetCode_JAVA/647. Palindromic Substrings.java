class Solution {
    int count=1;
    public int countSubstrings(String s) {
        for(int iter=0; iter<s.length()-1; iter++){
            checkPalindrome(s,iter, iter);//odd length
            checkPalindrome(s, iter,  iter+1); //even;
        }
        return count;
    }
    
    private void checkPalindrome(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            count++;
            start--;
            end++;
        }
    }
}
