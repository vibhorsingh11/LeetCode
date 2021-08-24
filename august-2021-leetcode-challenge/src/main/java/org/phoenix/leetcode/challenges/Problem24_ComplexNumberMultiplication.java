package org.phoenix.leetcode.challenges;

/**
 * A complex number can be represented as a string on the form "real+imaginaryi" where:
 * <p>
 * real is the real part and is an integer in the range [-100, 100].
 * imaginary is the imaginary part and is an integer in the range [-100, 100].
 * i2 == -1.
 * Given two complex numbers num1 and num2 as strings, return a string of the complex number that represents their multiplications.
 * Constraints:
 * <p>
 * num1 and num2 are valid complex numbers.
 */

public class Problem24_ComplexNumberMultiplication {
    public String complexNumberMultiply(String num1, String num2) {
        String str = num1 + num2;
        int[] arr = new int[4];

        StringBuilder temp = new StringBuilder();
        int i = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '+' || ch == 'i') {
                arr[i++] = Integer.parseInt(temp.toString());

                temp = new StringBuilder();
            } else {
                temp.append(ch);
            }
        }

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];
        int ipart = (b * c) + (a * d);
        int rpart = (a * c) - (b * d);
        return rpart + "+" + ipart + "i";
    }
}
