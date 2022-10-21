// Approch 1
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] count = new int[123];
       for(char c : magazine.toCharArray()){
           count[c]++;
       }
       
       for(char c : ransomNote.toCharArray()){
           if(count[c] == 0)  return false;
           else count[c]--;
       }

        return true;
    }
}


/*--------------------------------------------------------------------------------*/
// Approch 2
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i))){
                if(map.get(ransomNote.charAt(i)) > 1){
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
                }
                else{
                    map.remove(ransomNote.charAt(i));
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
