package org.phoenix.leetcode.challenges;

/*
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of
 * integers (h, k), where h is the height of the person and k is the number of people in front of
 *  this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 * Note:
 * The number of people is less than 1,100.
 *
 * Example
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Problem06_QueueReconstructionHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            else return a[1] - b[1];
        });
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int[] person : people) {
            tmp.add(person[1], person);
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < tmp.size(); i++) {
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        return res;
    }
}
