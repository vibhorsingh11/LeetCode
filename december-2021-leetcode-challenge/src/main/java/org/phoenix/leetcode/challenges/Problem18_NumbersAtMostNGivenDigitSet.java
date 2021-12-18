package org.phoenix.leetcode.challenges;

/**
 * Given an array of digits which is sorted in non-decreasing order. You can write numbers using each digits[i] as many
 * times as we want. For example, if digits = ['1','3','5'], we may write numbers such as '13', '551', and '1351315'.
 * <p>
 * Return the number of positive integers that can be generated that are less than or equal to a given integer n.
 * Constraints:
 * <p>
 * 1 <= digits.length <= 9
 * digits[i].length == 1
 * digits[i] is a digit from '1' to '9'.
 * All the values in digits are unique.
 * digits is sorted in non-decreasing order.
 * 1 <= n <= 109
 */

public class Problem18_NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        char[] N = String.valueOf(n).toCharArray();
        int len = N.length;
        int res = 1, pres, smaller = -1;

        for(int i = 1, m = 1; i <= len; i++, m *= digits.length) {
            pres = res;
            res = 0;
            int x = N[len-i] - '0';
            for(String d: digits) {
                if(Integer.parseInt(d) < x) res += m;
                else if(Integer.parseInt(d) == x) res += pres;
            }
            smaller += m;
        }

        return res + smaller;
    }
}
