import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder()); 

        for(int stone : stones) {
            maxHeap.add(stone); 
        }

        while (maxHeap.size() > 1) {
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();

            if(s1 > s2) {
                maxHeap.add(s1 - s2);
            }
        }

        if(maxHeap.size() == 0) return 0;
        return maxHeap.peek();

        // better if - return maxHeap.isEmpty() ? 0 : maxHeap.peek()
    }
}