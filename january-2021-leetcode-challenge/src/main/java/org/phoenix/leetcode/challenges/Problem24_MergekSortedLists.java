/*
* You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
* Merge all the linked-lists into one sorted linked-list and return it.
* Example 1:
* Input: lists = [[1,4,5],[1,3,4],[2,6]]
* Output: [1,1,2,3,4,4,5,6]
* Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
* merging them into one sorted list:
* 1->1->2->3->4->4->5->6
*/
package org.phoenix.leetcode.challenges;

public class Problem24_MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeKLists(lists, start, mid);

        ListNode right = mergeKLists(lists, mid + 1, end);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {

        ListNode head = new ListNode(-1);

        ListNode temp = head;

        while (left != null && right != null) {

            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return head.next;
    }
}
