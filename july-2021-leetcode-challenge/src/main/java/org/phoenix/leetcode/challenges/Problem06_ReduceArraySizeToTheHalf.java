package org.phoenix.leetcode.challenges;

import java.util.*;

/**
 * Given an array arr.  You can choose a set of integers and remove all the occurrences of these integers in the array.
 * <p>
 * Return the minimum size of the set so that at least half of the integers of the array are removed.
 * Constraints:
 * <p>
 * 1 <= arr.length <= 10^5
 * arr.length is even.
 * 1 <= arr[i] <= 10^5
 */

public class Problem06_ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int arrlen = arr.length;
        for (int i : arr) {

            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        int count = 0, sum = 0;

        for (Integer integer : list) {
            sum += integer;
            count++;
            if (sum >= (arrlen / 2)) {

                break;
            }

        }


        return count;
    }
}
