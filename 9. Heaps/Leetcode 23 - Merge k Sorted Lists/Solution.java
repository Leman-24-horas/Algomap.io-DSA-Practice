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
import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) ->
            Integer.compare(a.val, b.val)
        );

        for(ListNode node : lists) {
            if(node != null) {
                queue.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(queue.size() > 0) {
            curr.next = queue.poll();
            curr = curr.next;

            if(curr.next != null) {
                queue.add(curr.next); // next node of the same linked list
            }
        }

        return dummy.next;
    }
}