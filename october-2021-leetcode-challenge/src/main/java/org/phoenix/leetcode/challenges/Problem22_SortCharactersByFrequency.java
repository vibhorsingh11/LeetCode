package org.phoenix.leetcode.challenges;

/**
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
 * <p>
 * Return the sorted string. If there are multiple answers, return any of them.
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 105
 * s consists of uppercase and lowercase English letters and digits.
 */

public class Problem22_SortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] count = new int[128];
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }
        while (sb.length() < s.length()) {
            char max = 0;
            for (char current = 0; current < count.length; current++) {
                if (count[current] > count[max])
                    max = current;
            }
            while (count[max] > 0) {
                sb.append(max);
                count[max]--;
            }
        }
        return sb.toString();
    }
}
