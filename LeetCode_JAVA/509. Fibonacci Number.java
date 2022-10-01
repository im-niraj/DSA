// Recursion Approach
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




// Iterative Approach
class Solution {
    public int fib(int n) {
        int [] f= new int[n+2];
        
        f[0] = 0;
        f[1] = 1;
        
        
        for(int i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        
        return f[n];
     
    }
}

// Time Complexity: O(n)
// Auxiliary space: O(n)

