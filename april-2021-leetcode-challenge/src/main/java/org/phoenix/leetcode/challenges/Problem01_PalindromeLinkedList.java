/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 * <p>
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 * <p>
 * Constraints:
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 * <p>
 * Follow up: Could you do it in O(n) time and O(1) space?
 */
package org.phoenix.leetcode.challenges;

import java.util.Stack;

public class Problem01_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            s.push(curr.val);
            curr = curr.next;
        }
        while (head != null) {
            int n = s.pop();
            if (head.val != n) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}
