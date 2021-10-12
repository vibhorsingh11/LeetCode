package org.phoenix.leetcode.challenges;

/**
 * <p>
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns 3 possible results:
 * <p>
 * -1: The number I picked is lower than your guess (i.e. pick < num).
 * 1: The number I picked is higher than your guess (i.e. pick > num).
 * 0: The number I picked is equal to your guess (i.e. pick == num).
 * Return the number that I picked.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2^31 - 1
 * 1 <= pick <= n
 */

public class Problem12_GuessNumberHigherOrLower {
    protected int pick = 0;

    private int guess(int num) {
        return Integer.compare(pick, num);
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = low + (high - low) / 2;
        while (guess(mid) != 0) {
            mid = low + (high - low) / 2;
            int g = guess(mid);
            if (g < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid;
    }
}
