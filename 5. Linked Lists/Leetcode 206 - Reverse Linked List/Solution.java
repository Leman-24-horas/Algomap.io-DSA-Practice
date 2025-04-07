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
    public ListNode reverseList(ListNode head) {
        // if(head == null) {
        //     return head;
        // }

        // ListNode nextNode = null;
        // ListNode currNode = head;

        // while(currNode.next != null) {
        //     ListNode temp = currNode.next;
        //     currNode.next = nextNode;
        //     nextNode = currNode;
        //     currNode = temp;
        // }

        // // For the last node
        // currNode.next = nextNode;
        // head = currNode;

        // return head;

        /* the video gives a better way to visualize this */
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

            // if(curr != null && curr.next == null) {
            //     head = curr;
            // }
        }

        // return head;
        return prev;
    }
}