/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        /* My code was actually 90% right
           - Only changes are Map<OldNode, NewNode>
           - Map doesnt guarantee insertion order that's why map.get(oldhead) = copyHead
           - Using key as int is not optimal because what if 2 nodes have same value? map doesn't allow duplication
         */
        
        if(head == null) return null; // Edge case if head == null return null

        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        while(curr != null) {
            Node copy = new Node(curr.val);
            map.put(curr, copy);
            curr = curr.next; // increment to prevent infinite while loop
        }

        /* TODO
           - Set next copyNodes
           - Set randomCopyNodes
         */

        curr = head;
        while(curr != null) {
            Node copy = map.get(curr); // returns actual copy node

            if(curr.next == null) {
                copy.next = null;
            } else {
                Node oldNextNode = curr.next;
                Node nextCopyNode = map.get(oldNextNode); // find the equivalent of the next node in the copy
                copy.next = nextCopyNode; // set the next node
            }

            if(curr.random == null) {
                copy.random = null;
            } else {
                Node oldRandNode = curr.random;
                Node randCopy = map.get(oldRandNode);
                copy.random = randCopy; // set random
            }

            curr = curr.next; // to loop through linkedlist
        }

        return map.get(head); // 0ms, 100%

        // O(n)
    }
}