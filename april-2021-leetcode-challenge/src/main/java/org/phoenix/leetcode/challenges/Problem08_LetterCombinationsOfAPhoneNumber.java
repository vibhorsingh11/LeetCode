/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * Example 1:
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 * Input: digits = ""
 * Output: []
 * Example 3:
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * <p>
 * Constraints:
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
package org.phoenix.leetcode.challenges;

import java.util.ArrayList;
import java.util.List;

public class Problem08_LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[] set = new String[10];
        set[2] = "abc";
        set[3] = "def";
        set[4] = "ghi";
        set[5] = "jkl";
        set[6] = "mno";
        set[7] = "pqrs";
        set[8] = "tuv";
        set[9] = "wxyz";

        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }

        helper(ans, digits, set, 0, "");

        return ans;
    }

    private void helper(List<String> ans, String digits, String[] set, int index, String currString) {
        if (index == digits.length()) {
            ans.add(currString);
            return;
        }

        String possibleChars = set[digits.charAt(index) - '0'];
        for (char c : possibleChars.toCharArray()) {
            helper(ans, digits, set, index + 1, currString + c);
        }

    }
}
