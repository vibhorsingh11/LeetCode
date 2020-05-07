package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_MajorityElementTest {

    private final Problem06_MajorityElement test = new Problem06_MajorityElement();

    @Test
    void majorityElement() {
        int[] arr = new int[]{3,2,3};
        int[] arr1 = new int[]{2,2,1,1,1,2,2};

        assertEquals(3,test.majorityElement(arr));
        assertEquals(2,test.majorityElement(arr1));
    }
}