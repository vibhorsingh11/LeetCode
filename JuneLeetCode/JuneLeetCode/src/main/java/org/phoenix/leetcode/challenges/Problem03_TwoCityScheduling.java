package org.phoenix.leetcode.challenges;

/*
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to
 * city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 *
 * Example 1:
 * Input: [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 *
 * Explanation:
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 *
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 *
 * Note:
 * 1 <= costs.length <= 100
 * It is guaranteed that costs.length is even.
 * 1 <= costs[i][0], costs[i][1] <= 1000
 */

import java.util.Arrays;
import java.util.Comparator;

public class Problem03_TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        // sorting the array
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));
        int price = 0;
        int x = 0;
        // equal cities count
        int k = Math.abs(costs.length / 2);
        // looping over the array
        for (int[] cost : costs) {
            // if city A count is less than equal count then add first value from sub-array
            // else add second value from sub-array
            if (x < k) {
                price += cost[0];
                x++;
            } else {
                price += cost[1];
            }
        }
        return price;
    }
}
