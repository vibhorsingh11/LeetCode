package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem18_RangeSumQueryMutableTest {

    @Test
    void update() {
    }

    @Test
    void sumRange() {
        int[] nums = new int[]{1, 3, 5};
        Problem18_RangeSumQueryMutable test = new Problem18_RangeSumQueryMutable(nums);
        System.out.println(test.sumRange(0, 2));
        test.update(1, 2);
        System.out.println(test.sumRange(0, 2));
    }
}