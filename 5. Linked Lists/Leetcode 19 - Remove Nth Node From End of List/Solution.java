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
        // Approach 1
        // ListNode curr = head;
        // int len = 0;
        // while(curr != null) {
        //     len++;
        //     curr = curr.next;
        // }

        // if (len == 1) {
        //     return null;
        // } else if (len - n == 0) { // if head is being removed
        //     head = head.next;
        //     return head;
        // }

        // curr = head;
        // for(int i = 0; i < len - n; i++) {
        //     if(i == len - n - 1) {
        //         curr.next = curr.next.next;
        //     }
        //     curr = curr.next;
        // }
        // return head; // 0ms, 100%

        // Approach 2
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode ahead = dummy;
        ListNode behind = dummy;

        for(int i = 0; i < n+1; i++) {
            ahead = ahead.next;
        }

        while(ahead != null) {
            behind = behind.next;
            ahead = ahead.next;
        }

        behind.next = behind.next.next;
        
        return dummy.next;
    }
}