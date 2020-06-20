package org.phoenix.leetcode.challenges;

/*
* The set [1,2,3,...,n] contains a total of n! unique permutations.
* By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"

* Given n and k, return the kth permutation sequence.
*
* Note:
* Given n will be between 1 and 9 inclusive.
* Given k will be between 1 and n! inclusive.
*
* Example 1:
* Input: n = 3, k = 3
* Output: "213"
*
* Example 2:
* Input: n = 4, k = 9
* Output: "2314"
*/

import java.util.ArrayList;
import java.util.List;

public class Problem20_PermutationSequence {
    public String getPermutation(int n, int k) {
        if (n <= 0 || k <= 0) {
            return "";
        }
        List<Integer> numbers = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        k--;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            factorial /= (n - i);
            int index = k / factorial;
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial;
        }
        return result.toString();

    }
}
