package org.phoenix.leetcode.challenges;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Example 1:
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * Constraints:
 * 0 <= n <= 5 * 106
 */

public class Problem10_CountPrimes {
    public int countPrimes(int n) {
        //Array to store values till n
        boolean[] primes = new boolean[n];
        // We are assuming all as primes expect
        // 0 and 1
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        // We know that there are no primes greater than 
        // current number and its square
        for (int i = 2; i * i < n; i++) {
            if (!primes[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
            }
        }
        // Count of primes less than n
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
}
