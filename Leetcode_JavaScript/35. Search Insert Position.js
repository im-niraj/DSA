/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let start =0;
    let end = nums.length-1;
    while(start < end){
        if(nums[start] < target){
            start++;
        }else if(nums[end]> target){
            end--;
        }
        if(nums[start] === target){
            return start;
        }
        if(nums[end] === target){
            return end;
        }
        if(nums[end]< target){
            return end+1;
        }
        if(nums[start] > target){
            return start;
        }
    }
    if(nums.length == 1){
        return nums[0] >= target ? 0 : 1;
    }
    return start;   
};
