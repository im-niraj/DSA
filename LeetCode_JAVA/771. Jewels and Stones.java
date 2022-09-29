/*
You're given strings jewels representing the types of stones that are jewels,
and stones representing the stones you have. Each character in stones is a type of stone you have. 
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 

Constraints:

* 1 <= jewels.length, stones.length <= 50
* jewels and stones consist of only English letters.
* All the characters of jewels are unique.

*/


// Approch 1
/*
using two for loop check every character of jewels with stones character if both are equal then 
increment counter
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count=0;
        
        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i)==stones.charAt(j))count++;
            }
        }
    
        return count;
        
    }
}


// Approch 2
/*

Using key value pair by using HashMap 
1. store all character of stones and their occurance
2. iterate over jewels and check if this character is available in map then add their occurance in a counter variable
3. return the counter

*/


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
       HashMap<Character, Integer> map = new HashMap<>();
        
        int count=0;
        
        for(int i=0; i<stones.length(); i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0)+1);
        }
        
        
        for(int i=0; i<jewels.length(); i++){
            if(map.containsKey(jewels.charAt(i))){
                count +=map.get(jewels.charAt(i));
            }
        }
        
        return count;
    }
}
