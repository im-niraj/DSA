// Recursion Approch
class Solution {
    public int fib(int n) {
        // if n is negative then return 0
        if(n<0){
            return 0;
        }
      
        // if n==0 return 0
        if(n==0){
            return 0;
        }
      
        // if n==1 return 1
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}

// Time Complexity: Exponential, O(2^n)
// Space Complexity: O(1)
// if we consider the function call stack size then O(n)
