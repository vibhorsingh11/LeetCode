package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem31_SearchSuggestionsSystemTest {

    private final Problem31_SearchSuggestionsSystem test = new Problem31_SearchSuggestionsSystem();

    @Test
    void suggestedProducts() {
        String[] products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("mobile", "moneypot", "monitor"));
        expected.add(Arrays.asList("mobile", "moneypot", "monitor"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        assertEquals(expected, test.suggestedProducts(products, searchWord));
    }
}