import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // number, frequency

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue()) // sort by freq in asc order
        );

        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if(queue.size() < k) {
                queue.add(entrySet);
            } else {
                // 1. remove the smallest element (ie topmost)
                // 2. add the larger element
                queue.add(entrySet);
                queue.remove();
            }
        }

        // System.out.println(map);
        // System.out.println(queue);

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }


        return result;
    }
}

// No need to make a hashmap and reverse it
// You can just use entry set
// Then define your own way of comparing in the priority queue
// a and b are map entries