/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Approach 1 - Hashset
        // Set<ListNode> set = new HashSet<>();
        // ListNode curr = head;

        // while(curr != null) {
        //     if(!set.contains(curr)) {
        //         set.add(curr);
        //         curr = curr.next;
        //     } else {
        //         return true;
        //     }
        // }

        // return false; // 5ms, 9.10%

        // Approach 2 - Using 2 ptrs
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // for any .next make sure the node actually exists first
            if(slow == fast) { // make sure nodes are the same
                return true;
            }
        }
        return false; // 0ms, 100%
    }
}