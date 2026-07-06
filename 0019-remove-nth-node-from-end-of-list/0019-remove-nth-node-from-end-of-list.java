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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode hare = head;
       ListNode turtle = head;
       for(int i = 0; i < n; i++){
        hare = hare.next;
       }
       if(hare == null){
        return head.next;
       }
       while(hare.next != null){
        hare = hare.next;
        turtle = turtle.next;
       }
       turtle.next = turtle.next.next;
       return head;
    }
}