package org.phoenix.leetcode.learn.arrays;

/*Given an array nums of integers, return how many of them contain an even number of digits.


Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.*/

public class Problem02_EvenNumber {

    public int findNumbers(int[] nums) {
        // Variable will be used to count the even numbers
        int count = 0;
        // Looping over the array
        for(int value : nums) {
            int num = (int) Math.floor(Math.log10(value) + 1);
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
