/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */

 /**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let count = 0;
    for(let value of nums) {
        // let num = value.toString().split('').length;
        let num = Math.floor(Math.log10(value) + 1);
        if(num % 2 == 0){
            count++;
        }
    }
    return count;
};