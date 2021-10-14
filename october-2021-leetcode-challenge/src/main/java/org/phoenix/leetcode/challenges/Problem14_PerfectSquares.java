package org.phoenix.leetcode.challenges;

import java.util.*;

/**
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 * <p>
 * A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */

public class Problem14_PerfectSquares {
    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; ++i)
            squares.add(i * i);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        Set<Integer> visited = new HashSet<>();
        visited.add(n);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int currSum = queue.poll();
                if (currSum == 0)
                    return level;
                for (int square : squares) {
                    if (currSum - square >= 0) {
                        if (!visited.contains(currSum - square))
                            queue.offer(currSum - square);
                    } else {
                        break;
                    }
                    visited.add(currSum - square);
                }
            }
            level++;
        }
        return -1;
    }
}
