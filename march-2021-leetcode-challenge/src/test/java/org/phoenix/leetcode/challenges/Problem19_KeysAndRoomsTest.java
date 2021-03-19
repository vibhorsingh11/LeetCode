package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem19_KeysAndRoomsTest {

    private final Problem19_KeysAndRooms test = new Problem19_KeysAndRooms();

    @Test
    void canVisitAllRooms() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Collections.singletonList(1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(3));
        rooms.add(Collections.emptyList());
        assertTrue(test.canVisitAllRooms(rooms));
    }
}