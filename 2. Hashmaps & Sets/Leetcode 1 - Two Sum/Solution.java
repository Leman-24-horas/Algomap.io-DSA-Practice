import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            m.put(nums[i], i);
        }

        int[] indices = new int[2];
        for(int i = 0; i < n; i++) {
            int match = target - nums[i];
            if(m.containsKey(match) && m.get(match) != i) {
                indices[0] = i;
                indices[1] = m.get(match);
                return indices;
            }
        }

        return indices; // O(n) 4ms, 60.38%
    }
}