class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }    
}
// time complexity: O(nlogn)

/*-------------------------------------------*/
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        return n*(n+1)/2-sum;
    }
}
// time complexity: O(n)
// Auxiliary space: O(1)
