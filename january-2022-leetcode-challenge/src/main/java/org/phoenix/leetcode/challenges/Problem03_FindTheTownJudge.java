package org.phoenix.leetcode.challenges;

/**
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
 * <p>
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 * 0 <= trust.length <= 104
 * trust[i].length == 2
 * All the pairs of trust are unique.
 * ai != bi
 * 1 <= ai, bi <= n
 */

public class Problem03_FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n - 1) {
            return -1;
        }
        int[] inEdges = new int[n + 1];
        int[] outEdges = new int[n + 1];
        for (int[] relation : trust) {
            outEdges[relation[0]]++;
            inEdges[relation[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (inEdges[i] == n - 1 && outEdges[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
