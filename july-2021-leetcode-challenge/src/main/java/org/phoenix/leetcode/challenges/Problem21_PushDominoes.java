package org.phoenix.leetcode.challenges;

/**
 * There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 * <p>
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 * <p>
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 * <p>
 * For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.
 * <p>
 * You are given a string dominoes representing the initial state where:
 * <p>
 * dominoes[i] = 'L', if the ith domino has been pushed to the left,
 * dominoes[i] = 'R', if the ith domino has been pushed to the right, and
 * dominoes[i] = '.', if the ith domino has not been pushed.
 * Return a string representing the final state.
 * Constraints:
 * <p>
 * n == dominoes.length
 * 1 <= n <= 105
 * dominoes[i] is either 'L', 'R', or '.'.
 */

public class Problem21_PushDominoes {
    public String pushDominoes(String dominoes) {
        char[] a = dominoes.toCharArray();
        int L = -1, R = -1;
        for (int i = 0; i <= dominoes.length(); i++)
            if (i == a.length || a[i] == 'R') {
                if (R > L)
                    while (R < i)
                        a[R++] = 'R';
                R = i;
            } else if (a[i] == 'L')
                if (L > R || R == -1)
                    while (++L < i)
                        a[L] = 'L';
                else {
                    L = i;
                    int lo = R + 1, hi = L - 1;
                    while (lo < hi) {
                        a[lo++] = 'R';
                        a[hi--] = 'L';
                    }
                }
        return new String(a);
    }
}
