package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.phoenix.leetcode.challenges.Problem07_DesignHashMap.MyHashMap;


class Problem07_DesignHashMapTest {

    private final MyHashMap hashMap = new MyHashMap();

    @Test
    void test() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertEquals(1, hashMap.get(1));
        assertEquals(-1, hashMap.get(3));
        hashMap.put(2, 1);
        assertEquals(1, hashMap.get(2));
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
    }

}