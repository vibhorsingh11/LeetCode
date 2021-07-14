package org.phoenix.leetcode.challenges;

/**
 * order and str are strings composed of lowercase letters. In order, no letter occurs more than once.
 * <p>
 * order was sorted in some custom order previously. We want to permute the characters of str so that they match the order that order was sorted. More specifically, if x occurs before y in order, then x should occur before y in the returned string.
 * <p>
 * Return any permutation of str (as a string) that satisfies this property.
 * Note:
 * <p>
 * order has length at most 26, and no character is repeated in order.
 * str has length at most 200.
 * order and str consist of lowercase letters only.
 */

public class Problem14_CustomSortString {
    public String customSortString(String order, String str) {
        //Base case
        if (order == null || str == null) {
            return str;
        }
        // Storing the frequency of each char in str
        int[] freqMap = new int[26];
        for (char c : str.toCharArray()) {
            freqMap[c - 'a']++;
        }
        // Resultant String
        StringBuilder resultStr = new StringBuilder();
        // append if frequency is zero
        for (int index = 0; index < order.length(); index++) {
            char c = order.charAt(index);
            while (freqMap[c - 'a'] > 0) {
                resultStr.append(c);
                freqMap[c - 'a']--;
            }
        }
        // Append if not zero
        for (int index = 0; index < freqMap.length; index++) {
            while (freqMap[index] > 0) {
                resultStr.append((char) (index + 'a'));
                freqMap[index]--;
            }
        }
        return resultStr.toString();
    }
}
