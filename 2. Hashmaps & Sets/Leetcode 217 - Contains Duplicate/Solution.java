import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            if(!s.contains(i)) {
                s.add(i);
            } else {
                return true;
            }
        }
        return false; // 10ms, 88.39%
    }
}
