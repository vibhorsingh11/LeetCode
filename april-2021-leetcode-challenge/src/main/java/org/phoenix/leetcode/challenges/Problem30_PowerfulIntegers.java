package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given three integers x, y, and bound, return a list of all the powerful integers that have a value less than or equal to bound.
 * <p>
 * An integer is powerful if it can be represented as xi + yj for some integers i >= 0 and j >= 0.
 * <p>
 * You may return the answer in any order. In your answer, each value should occur at most once.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 2, y = 3, bound = 10
 * Output: [2,3,4,5,7,9,10]
 * Explanation:
 * 2 = 20 + 30
 * 3 = 21 + 30
 * 4 = 20 + 31
 * 5 = 21 + 31
 * 7 = 22 + 31
 * 9 = 23 + 30
 * 10 = 20 + 32
 * Example 2:
 * <p>
 * Input: x = 3, y = 5, bound = 15
 * Output: [2,4,6,8,10,14]
 * <p>
 * Constraints:
 * <p>
 * 1 <= x, y <= 100
 * 0 <= bound <= 106
 */

public class Problem30_PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        for (int powerX = 1; powerX < bound; powerX = powerX * x) {
            for (int powerY = 1; powerY < bound; powerY = powerY * y) {
                int generatedNo = powerX + powerY;
                if (generatedNo <= bound) {
                    set.add(generatedNo);
                }
                if (y == 1) {
                    break;
                }
            }
            if (x == 1) {
                break;
            }
        }
        return new ArrayList<>(set);
    }
}
