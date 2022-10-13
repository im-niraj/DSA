// Time Complexity = O(n)
// space = O(n)
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftHeighest = new int[n];
        int[] rightHeighest = new int[n];
        
        leftHeighest[0] = height[0];
        
      //height = [0,1,0,2,1,0,1,3,2,1,2,1]
        for(int i=1; i<n; i++){
            leftHeighest[i] = Math.max(leftHeighest[i-1], height[i]);
        }
        // 0 1 1 2 2 2 2 3 3 3 3 3
        rightHeighest[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightHeighest[i] = Math.max(rightHeighest[i+1], height[i]);
        }
        // 3 3 3 3 3 3 3 3 2 2 2 1
        
        
        int sum=0;
        for(int i=0; i<n; i++){
            sum+= Math.min(leftHeighest[i]-height[i], rightHeighest[i]-height[i]);
        }
        
        return sum;
        
    }
}
