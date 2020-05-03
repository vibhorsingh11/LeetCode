package org.phoenix.leetcode.learn.arrays;

/*
 * Given an array arr of integers,
 * check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * */

import java.util.HashSet;

public class Problem08_CheckIfNandItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : arr) {
            if (set.contains(2 * value) || (set.contains(value / 2)) && value % 2 == 0) {
                return true;
            }
            set.add(value);
        }
        return false;
    }
}
