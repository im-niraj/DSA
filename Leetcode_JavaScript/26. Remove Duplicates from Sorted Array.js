/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let obj = {};
    let arr = [];
    for (let i = 0; i < nums.length; i++) {
        if(!obj.hasOwnProperty(nums[i])){
            obj[nums[i]] = i;
            arr.push(nums[i]);
        }
    }
    
    for (let i = 0; i < arr.length; i++) {
        nums[i] = arr[i];
    }
    return arr.length;

}
