package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem28_ReconstructItineraryTest {

    private final Problem28_ReconstructItinerary test = new Problem28_ReconstructItinerary();

    @Test
    void findItinerary() {
        String[][] arr = new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
//        List<List<String>> list = Arrays.asList(arr);
        String[] res = new String[]{"JFK","ATL","JFK","SFO","ATL","SFO"};
        List<String[]> expected = (List<String[]>) Arrays.asList(res);

//        assertEquals(expected,test.findItinerary(list));
    }
}