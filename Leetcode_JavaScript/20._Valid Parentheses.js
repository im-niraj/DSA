/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let parentheses = {
        "(":")",
        "{":"}",
        "[":"]",
    }
    for(let i=0; i<s.length; i++){
        if(parentheses[s[i]])
    }
    return true;
};
