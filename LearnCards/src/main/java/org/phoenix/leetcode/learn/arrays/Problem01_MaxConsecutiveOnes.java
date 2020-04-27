package org.phoenix.leetcode.learn.arrays;

/*
*Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
*/
public class Problem01_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        // If length of array is less than 0 then
        if(nums.length == 0) return 0;
        // Variable will count the consecutive ones
        int count = 0;
        // It will keep the max count of consecutive ones
        int max = 0;
        // Looping over the array
        for(int digit : nums) {
            // If the element is 1 then increament the counter
            if(digit == 1){
                count++;
                // If count is greater than max then max is set equal to count
                if(count > max)
                    max = count;
            } else {
                // Rest the count to 0
                count = 0;
            }
        }
        // Return the max count
        return max;
    }
}
