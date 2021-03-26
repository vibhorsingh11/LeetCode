/**
 * We are given two arrays A and B of words.  Each word is a string of lowercase letters.
 * <p>
 * Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".
 * <p>
 * Now say a word a from A is universal if for every b in B, b is a subset of a.
 * <p>
 * Return a list of all universal words in A.  You can return the words in any order.
 * <p>
 * Example 1:
 * Input: A = ["amazon","apple","facebook","google","leetcode"], B = ["e","o"]
 * Output: ["facebook","google","leetcode"]
 * Note:
 * <p>
 * 1 <= A.length, B.length <= 10000
 * 1 <= A[i].length, B[i].length <= 10
 * A[i] and B[i] consist only of lowercase letters.
 * All words in A[i] are unique: there isn't i != j with A[i] == A[j].
 */
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

public class Problem26_WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        // Result list
        List<String> ans = new ArrayList<>();
        // Array to store maximum frequency of characters
        int[] maxFreqAcrossB = new int[26];
        // Loop through array B
        for (String bStr : B) {
            // Frequency of each word
            int[] freqCountBStr = freq(bStr);
            for (int i = 0; i < 26; i++) {
                maxFreqAcrossB[i] = Math.max(maxFreqAcrossB[i], freqCountBStr[i]);
            }
        }
        for (String aStr : A) {
            int[] freqCountAStr = freq(aStr);
            boolean foundAllChar = true;
            for (int i = 0; i < 26; i++) {
                if (freqCountAStr[i] < maxFreqAcrossB[i]) {
                    foundAllChar = false;
                    break;
                }
            }
            if (foundAllChar) {
                ans.add(aStr);
            }
        }
        return ans;
    }

    private int[] freq(String s) {
        int[] freqCount = new int[26];
        for (char c : s.toCharArray()) {
            freqCount[c - 'a']++;
        }
        return freqCount;
    }

}
