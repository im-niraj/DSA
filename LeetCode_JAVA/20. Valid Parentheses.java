/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.


*/


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
       
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.empty() && map.get(stack.peek()) == s.charAt(i)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty()? true:false;
        
    }
}

/*
1. first make a bracket pair
2. if Parentheses is available in map key then store it in stack
3. else check stack should not be empty and stack peek value should be opposite of ith character
4. else return false
5. if stack is empty then true or false return
*/



// Another approch without stack and hashMap
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                list.add(s.charAt(i));
            }
            else{
                if(s.charAt(i)==')'){
                    if(list.size()>0 && list.get(list.size()-1) == '('){
                        list.remove(list.size()-1);
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)=='}'){
                    if(list.size()>0 && list.get(list.size()-1) == '{'){
                        list.remove(list.size()-1);
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)==']'){
                    if(list.size()>0 && list.get(list.size()-1) == '['){
                        list.remove(list.size()-1);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return list.size() == 0 ? true : false;
    }
}
