// solution 1
class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
           int pro=1;
            for(int j=i; j<nums.length; j++){
                pro*=nums[j];
                if(max<pro){
                    max = pro;
                }
            }
            
        }
        
        return max;
    }
}


// solution 2
