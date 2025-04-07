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

    public ListNode deleteDuplicates(ListNode head) {
        
        // shorter code
        ListNode currNode = head;

        while(currNode != null && currNode.next != null) {
            /* this code is smarter than mine above because
               unlike my code you do not need to set null value explicitly
               if 3 at n-2 == 3 at n-1 then
               3.next = 3.next.next which is null 
               so you are instantly setting the null value to the last idx */
            if(currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next; 
                /* You're already given a linkedlist
                   So nodes are already linked
                   Where nodes match just skip those nodes */
            } else {
                currNode = currNode.next;
            }
        }
        return head; // 0ms, 100%
    }
}

/* If you are on head then head.next does 2 things
    1) head.next = someOtherNode (sets the next node that head is forward linked to)
    2) nextNode = head.next (gives the next node that head is linked to)

    so for curr = head
    curr.next = curr.next.next means
        you're on 1, skip the next 1, and link to 2
    
    on the LHS curr.next refers to the next node that you want to link with curr
    on the RHS curr.next returns the next node

    curr.next = curr.next means
    1 -> 1 -> 2
    link the first one to the second one
     */