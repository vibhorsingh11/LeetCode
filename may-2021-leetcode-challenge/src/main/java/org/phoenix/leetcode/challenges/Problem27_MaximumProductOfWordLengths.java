package org.phoenix.leetcode.challenges;

/**
 * Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.
 * Constraints:
 * <p>
 * 2 <= words.length <= 1000
 * 1 <= words[i].length <= 1000
 * words[i] consists only of lowercase English letters.
 */

public class Problem27_MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        if (words == null) return 0;
        // Max product
        int max = 0;

        int[] checkValues = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            int num = 0;
            for (int j = 0; j < words[i].length(); j++) {
                int x = words[i].charAt(j) - 'a';
                num |= 1 << x;

            }
            checkValues[i] = num;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((checkValues[i] & checkValues[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
