/*
 * The i-th person has weight people[i], and each boat can carry a maximum weight of limit.
 * Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.
 * Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)
 *
 * Example 1:
 * Input: people = [1,2], limit = 3
 * Output: 1
 * Explanation: 1 boat (1, 2)
 *
 * Note:
 * 1 <= people.length <= 50000
 * 1 <= people[i] <= limit <= 30000
 */
package org.phoenix.leetcode.challenges;

import java.util.Arrays;

public class Problem13_BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int trips = 0, i = 0, j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            trips++;
        }
        return trips;
    }
}
