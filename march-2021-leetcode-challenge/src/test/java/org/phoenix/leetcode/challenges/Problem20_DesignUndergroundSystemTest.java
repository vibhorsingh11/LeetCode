package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

class Problem20_DesignUndergroundSystemTest {

    @Test
    void checkIn() {
        Problem20_DesignUndergroundSystem undergroundSystem = new Problem20_DesignUndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));
    }
}