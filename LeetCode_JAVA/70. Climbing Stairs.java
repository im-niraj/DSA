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

/*
*  this approch working as an fibonacci series
*  Like 1 2 3 5 8 13 21
*  using while loop first taking temp and then assign to previous
*  in between we update our current value with previous
*/
