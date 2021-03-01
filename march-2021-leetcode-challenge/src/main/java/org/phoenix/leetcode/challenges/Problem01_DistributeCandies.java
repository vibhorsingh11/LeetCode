/**
 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
 * <p>
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
 * <p>
 * Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: candyType = [1,1,2,2,3,3]
 * Output: 3
 * Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
 * Constraints:
 * <p>
 * n == candyType.length
 * 2 <= n <= 104
 * n is even.
 * -105 <= candyType[i] <= 105
 */
package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Set;

public class Problem01_DistributeCandies {
    public int distributeCandies(int[] candyType) {
        // Set to store the types of candies
        Set<Integer> candyTypes = new HashSet<>();
        // Adding candies to
        for (int candy : candyType) {
            candyTypes.add(candy);
        }
        return Math.min(candyTypes.size(), candyType.length / 2);
    }
}
