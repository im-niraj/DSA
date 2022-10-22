class Solution {
    public int maxSubArray(int[] nums) {
        int temp=nums[0], max=nums[0];

        for(int i=1; i<nums.length; i++){
            temp = Math.max(temp+nums[i], nums[i]);
            max = Math.max(temp,max);
        }
        return max;
    }
}

// TC: O(n)

// --------------------------------------------
// Approch 2
class Solution {
    public int maxSubArray(int[] nums) {
        int temp=0;
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            temp+=nums[i];
            if(max < temp) max=temp;
            if(temp<0) temp=0;
        }
        return max;
    }
}

// TC: O(n)
