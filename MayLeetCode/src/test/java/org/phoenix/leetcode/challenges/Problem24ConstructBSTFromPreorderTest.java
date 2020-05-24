package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem24ConstructBSTFromPreorderTest {

    private final Problem24ConstructBSTFromPreorder test = new Problem24ConstructBSTFromPreorder();

    @Test
    void bstFromPreorder() {
        int[] arr = new int[]{8, 5, 1, 7, 10, 12};

        assertEquals(1, test.bstFromPreorder(arr).left.left.val);
    }
}