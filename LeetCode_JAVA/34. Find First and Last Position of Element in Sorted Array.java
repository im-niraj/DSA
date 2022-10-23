class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right  - left) / 2;
            if(nums[mid] == target && nums[left] == nums[right]){
                return new int[]{left, right};
            }
            else if(nums[mid] == target && nums[left] < target){
                left++;
            }
            else if(nums[mid] == target && nums[right] > target){
                right--;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}

// TC: O(logn)
// SC: O(1)
