/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let left = 0;
    let right = height.length -1;
    let max = 0;
    while(left < right){
        let x = right -left;
        let y = Math.min(height[left], height[right]);
        max = Math.max(max, x*y);
        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
    }
    return max;
    
};
