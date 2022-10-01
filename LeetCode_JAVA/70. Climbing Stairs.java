// Approch 1. fibonacci

class Solution {
    public int climbStairs(int n) {
       
        int pre = 0;
        int curr = 1;
        int temp = 0;
        
        while(n--!=0){
            temp = curr;
            curr = curr+pre;
            pre = temp;
        }
        
        return curr;
    }
}

// Time Complexity O(n)
// Space Complexity O(1)

/*
*  this approch working as an fibonacci series
*  Like 1 2 3 5 8 13 21
*  using while loop first taking temp and then assign to previous
*  in between we update our current value with previous
*/



// Approch 2. Recursion
class Solution {
    public int climbStairs(int n) {
       return steps(n);
    }
    public int steps(int n){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        return steps(n-1)+steps(n-2);
    }
}

//Time Complexity O(2^n)
//Space Complexity O(1)

/*
*
* The time complexity of the recursive solution is exponential
* a close upper bound is O(2^n). From each state 2,
*/
