package org.phoenix.leetcode.challenges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */

public class Problem26_CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> counts = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return counts;
        }
        int n = nums.length;
        Node[] nodes = new Node[n];
        Integer[] smaller = new Integer[n];
        Arrays.fill(smaller, 0);
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(nums[i], i);
        }
        mergeSort(nodes, smaller);
        counts.addAll(Arrays.asList(smaller));
        return counts;
    }

    private Node[] mergeSort(Node[] nodes, Integer[] smaller) {
        if (nodes.length <= 1) {
            return nodes;
        }
        int middle = nodes.length / 2;
        Node[] left = mergeSort(Arrays.copyOfRange(nodes, 0, middle), smaller);
        Node[] right = mergeSort(Arrays.copyOfRange(nodes, middle, nodes.length), smaller);
        for (int i = 0, j = 0; i < left.length || j < right.length; ) {
            if (j == right.length || i < left.length && left[i].value <= right[j].value) {
                nodes[i + j] = left[i];
                smaller[left[i].index] += j;
                i++;
            } else {
                nodes[i + j] = right[j];
                j++;
            }
        }
        return nodes;
    }


    static class Node {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
