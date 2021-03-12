/**
 * Given a binary string s and an integer k.
 * <p>
 * Return True if every binary code of length k is a substring of s. Otherwise, return False.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "00110110", k = 2
 * Output: true
 * Explanation: The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings at indicies 0, 1, 3 and 2 respectively.
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^5
 * s consists of 0's and 1's only.
 * 1 <= k <= 20
 */
package org.phoenix.leetcode.challenges;

import java.util.HashSet;
import java.util.Set;

public class Problem12_CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public boolean hasAllCodes(String s, int k) {
        // If k is greater than string length then return
        if (s.length() < k) {
            return false;
        }
        // Set to store substrings
        Set<String> set = new HashSet<>();
        // Looping over string and adding substrings to set
        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
        }
        // Comparing the set size
        return set.size() == (Math.pow(2, k));
    }
}
