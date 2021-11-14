package org.phoenix.leetcode.challenges;

import java.util.PriorityQueue;

/**
 * Design the CombinationIterator class:
 * <p>
 * CombinationIterator(string characters, int combinationLength) Initializes the object with a string characters of
 * sorted distinct lowercase English letters and a number combinationLength as arguments.
 * next() Returns the next combination of length combinationLength in lexicographical order.
 * hasNext() Returns true if and only if there exists a next combination.
 * Constraints:
 * <p>
 * 1 <= combinationLength <= characters.length <= 15
 * All the characters of characters are unique.
 * At most 104 calls will be made to next and hasNext.
 * It's guaranteed that all calls of the function next are valid.
 */

public class Problem14_IteratorForCombination {
    PriorityQueue<String> pq = new PriorityQueue<>();

    public Problem14_IteratorForCombination(String s, int k) {
        generateSub(s, k, 0, new StringBuilder());
    }

    private void generateSub(String s, int len, int start, StringBuilder result) {
        if (len == 0) {
            pq.add(result.toString());
            return;
        }
        for (int i = start; i <= s.length() - len; i++) {
            result.append(s.charAt(i));
            generateSub(s, len - 1, i + 1, result);
            result.deleteCharAt(result.length() - 1);
        }
    }

    public String next() {
        return pq.poll();
    }

    public boolean hasNext() {
        return !pq.isEmpty();
    }
}
