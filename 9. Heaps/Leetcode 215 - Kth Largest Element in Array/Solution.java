import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : nums) {
            queue.add(i);
        }

        int n = nums.length;

        while(queue.size() > n - k + 1) {
            queue.poll();
        }

        return queue.peek(); // 72ms 17.34%
    }
}