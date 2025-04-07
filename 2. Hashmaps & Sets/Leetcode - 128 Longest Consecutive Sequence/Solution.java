import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) return 0; // this is not needed

        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            s.add(i);
        }

        int length = 0; // initialize this inside the for loop
        int max = -1; // max should be 0
        for(int i : s) {
            if(!s.contains(i-1)) {
                length = 1;
                int next = i + 1;
                while(s.contains(next)) {
                    length++;
                    next++;
                }
                max = Math.max(length, max);
            }
        }
        return max; // 31ms, 53.09%
    }
}

// sort the array
// 1, 2, 3, 5, 6

// In the case of repeated elements counter should not increment
// 0, 0

// When do you set max?

// Case 60: [9,7,5,8,6] // what if the longest consecutive integers are in the second half of the array?
// -1, -1, 0, 1, 3, 4, 5, 6, 7, 8, 9

//Case 63: [9,4,8,3,6,7]
// -4,-3,-2,-1,1,2,3,4,6,7,8,9 
