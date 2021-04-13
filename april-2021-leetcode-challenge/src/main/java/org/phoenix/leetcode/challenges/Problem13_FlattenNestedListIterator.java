/**
 * You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
 * <p>
 * Implement the NestedIterator class:
 * <p>
 * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
 * int next() Returns the next integer in the nested list.
 * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nestedList = [[1,1],2,[1,1]]
 * Output: [1,1,2,1,1]
 * Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * Example 2:
 * <p>
 * Input: nestedList = [1,[4,[6]]]
 * Output: [1,4,6]
 * Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nestedList.length <= 500
 * The values of the integers in the nested list is in the range [-106, 106].
 */
package org.phoenix.leetcode.challenges;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Problem13_FlattenNestedListIterator {
    interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        List<NestedInteger> getList();
    }

    static class NestedIterator implements Iterator<Integer> {

        private final Stack<NestedInteger> nestedStack = new Stack<>();

        public NestedIterator(List<NestedInteger> nestedList) {
            if (nestedList == null) {
                return;
            }
            for (int i = nestedList.size() - 1; i >= 0; i--) {
                this.nestedStack.push(nestedList.get(i));
            }
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return nestedStack.pop().getInteger();
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            while (!nestedStack.isEmpty()) {
                NestedInteger top = nestedStack.peek();
                if (top.isInteger()) {
                    return true;
                } else {
                    nestedStack.pop();
                    for (int i = top.getList().size() - 1; i >= 0; i--) {
                        nestedStack.push(top.getList().get(i));
                    }
                }
            }
            return false;
        }
    }
}
