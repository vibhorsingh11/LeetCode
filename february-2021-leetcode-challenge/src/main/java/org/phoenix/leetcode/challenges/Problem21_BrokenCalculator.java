/**
 * On a broken calculator that has a number showing on its display, we can perform two operations:
 * <p>
 * Double: Multiply the number on the display by 2, or;
 * Decrement: Subtract 1 from the number on the display.
 * Initially, the calculator is displaying the number X.
 * <p>
 * Return the minimum number of operations needed to display the number Y.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: X = 2, Y = 3
 * Output: 2
 * Explanation: Use double operation and then decrement operation {2 -> 4 -> 3}.
 * Note:
 * <p>
 * 1 <= X <= 10^9
 * 1 <= Y <= 10^9
 */
package org.phoenix.leetcode.challenges;

public class Problem21_BrokenCalculator {
    public int brokenCalc(int X, int Y) {
        int minOperations = 0;
        while (Y > X) {
            minOperations++;
            Y = Y % 2 == 0 ? Y / 2 : Y + 1;
        }
        return minOperations + X - Y;
    }
}
