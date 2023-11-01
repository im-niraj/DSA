/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function(dividend, divisor) {
    let ans = dividend / divisor;
    let x = Math.pow(2,31)
    if(ans >= x){
        return x-1;
    }
    if(ans < -x){
        
        return -x+1;
    }
    ans = ans.toString();
    return ans.split('.')[0];
};
