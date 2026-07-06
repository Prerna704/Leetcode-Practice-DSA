/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) return head;

        // Step 1: calculate length
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Step 2: k modulo len
        k = k % len;
        if (k == 0) return head;

        // Step 3: make it circular
        tail.next = head;

        // Step 4: find new tail
        ListNode newTail = head;
        for (int i = 0; i < len - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        // Step 5: break the circle
        newTail.next = null;

        return newHead;
    

    }
}