/*
* Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), return the indexes
* of the k weakest rows in the matrix ordered from the weakest to the strongest.
* A row i is weaker than row j, if the number of soldiers in row i is less than the number of soldiers in row j, or
* they have the same number of soldiers but i is less than j. Soldiers are always stand in the frontier of a row,
* that is, always ones may appear first and then zeros.
*
* Example 1:
* Input: mat =
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]],
k = 3
* Output: [2,0,3]
* Explanation:
* The number of soldiers for each row is:
row 0 -> 2
row 1 -> 4
row 2 -> 1
row 3 -> 2
row 4 -> 5
* Rows ordered from the weakest to the strongest are [2,0,3,1,4]
*/
package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem15_TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] weakestRows = new int[k];
        int[][] rowSum = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            rowSum[i][0] = IntStream.of(mat[i]).sum();
            rowSum[i][1] = i;
        }
        Arrays.sort(rowSum, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < k; i++) {
            weakestRows[i] = rowSum[i][1];
        }
        return weakestRows;
    }
}
