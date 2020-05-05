package org.phoenix.leetcode.learn.arrays;

/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count
 *  as extra space.
 *
 * Example:
 * Input: [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * */

import java.util.ArrayList;
import java.util.List;

public class Problem15_FindAllNumbersDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Created a list for returning the data
        List<Integer> myList = new ArrayList<>();
        // Looping over the array
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                myList.add(i + 1);
            }
        }
        return myList;
    }
}
