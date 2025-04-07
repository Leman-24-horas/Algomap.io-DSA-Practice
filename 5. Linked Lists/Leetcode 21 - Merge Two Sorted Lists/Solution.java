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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        } else if (list1 == null && list2 != null) {
            return list2;
        } else if (list1 != null && list2 == null) {
            return list1;
        }

        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode head = new ListNode();

        if(c1.val <= c2.val) {
            head = c1;
        } else {
            head = c2;
        }

        while(c1 != null && c2 != null) {
            if(c1.val <= c2.val) {
                if(c1.next != null && c1.next.val <= c2.val ) {
                    c1 = c1.next;
                } else {
                    ListNode temp = c1.next;
                    c1.next = c2;
                    c1 = temp;
                }
            } else {
                if(c2.next != null && c2.next.val < c1.val) {
                    c2 = c2.next;
                } else {
                    ListNode temp = c2.next;
                    c2.next = c1;
                    c2 = temp;
                }
            }
        }
        return head;
    }
}