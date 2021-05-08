package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Let's say a positive integer is a super-palindrome if it is a palindrome, and it is also the square of a palindrome.
 * <p>
 * Given two positive integers left and right represented as strings, return the number of super-palindromes integers in the inclusive range [left, right].
 * <p>
 * Example 1:
 * Input: left = "4", right = "1000"
 * Output: 4
 * Explanation: 4, 9, 121, and 484 are superpalindromes.
 * Note that 676 is not a superpalindrome: 26 * 26 = 676, but 26 is not a palindrome.
 * Example 2:
 * Input: left = "1", right = "2"
 * Output: 1
 * <p>
 * Constraints:
 * 1 <= left.length, right.length <= 18
 * left and right consist of only digits.
 * left and right cannot have leading zeros.
 * left and right represent integers in the range [1, 1018].
 * left is less than or equal to right.
 */

public class Problem08_SuperPalindromes {

    public int superpalindromesInRange(String left, String right) {
        // storing palindrome values
        List<Long> palindromicNo = new ArrayList<>();
        // converting values to long
        long leftNo = Long.parseLong(left);
        long rightNo = Long.parseLong(right);
        // super palindrome counts
        int count = 0;
        // adding values till 9 in list
        for (long i = 1; i < 10; i++) {
            palindromicNo.add(i);
        }

        for (long i = 1; i < 10000; i++) {
            String leftPart = Long.toString(i);
            String rightPart = new StringBuilder(leftPart).reverse().toString();
            palindromicNo.add(Long.parseLong(leftPart + rightPart));
            for (int digit = 0; digit < 10; digit++) {
                palindromicNo.add(Long.parseLong(leftPart + digit + rightPart));
            }
        }

        for (long no : palindromicNo) {
            long squareNo = no * no;
            if (leftNo <= squareNo && rightNo >= squareNo && isPalindromic(Long.toString(squareNo))) {
                count++;
            }
        }
        return count;
    }

    // Check palindrome
    private boolean isPalindromic(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
}
