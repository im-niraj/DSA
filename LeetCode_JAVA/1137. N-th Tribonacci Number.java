/* ------------ Brute Force ------------ */
class Solution {
    public int tribonacci(int n) {
        
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int temp = 0;
        
        for(int i=3; i<=n; i++){
            temp = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = temp;
        }
        return n==0 ? t0 : t2;
        
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
