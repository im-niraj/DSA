/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let num = x;
    if(num < 0) num *= -1;
    let rev = 0;
    while(num > 0){
        rev = (rev * 10 ) +  num%10;
        num = Math.floor(num/10);
    }
    if(rev > Math.pow(2,31)){
        return 0;
    }
    if(x < 0) rev *= -1;
    return rev;
};
