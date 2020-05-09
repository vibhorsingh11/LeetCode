package org.phoenix.leetcode.challenges;

/*
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 *
 * Example 2:
 * Input: 14
 * Output: false*/

public class Problem09_ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;
        while (left <= right) {
            // calculating mid
            long mid = (left + right) / 2;
            // checking if mid is perfect square
            if (mid * mid == num) return true;
            // if mid is less than num then check left
            // else check right
            if (mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
