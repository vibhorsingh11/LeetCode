/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 *   Example 1:
 *   Input: [1,1,0,1,1,1]
 *   Output: 3
 *   Explanation: The first two digits or the last three digits are consecutive 1s.
 *       The maximum number of consecutive 1s is 3.
 *   Note:
 *
 *   The input array will only contain 0 and 1.
 *   The length of input array is a positive integer and will not exceed 10,000
*/

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    // Checking if length is greater than 0 else return 0;
    if(nums.length == 0) return 0;
    let count = 0, max = 0;
    // Iterating over the array for each value
    for(let digit of nums) {
        // If value is 1 then strart counting 1's and make it max if count is greater than max,
        // If 0 is encountered, this means consecutive 0's chain is broken so, reinitialize the count to 0
        if(digit == 1){
            count++;
            if(count > max)
                max = count;
        } else {
            count = 0;
        }
    }
    // Returning the max consecutive count of 1
    return max;
};