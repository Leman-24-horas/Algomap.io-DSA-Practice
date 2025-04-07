class Solution {
    public int majorityElement(int[] nums) {

        int ans = -1;
        int count = 0;

        for(int i : nums) {
            if(count == 0) {
                ans = i;
            } if (ans == i) {
                count++;
            } else {
                count--;
            }
        }

        return ans; // 1ms, 99.86%
    }
}

// What if you start from half and then go right or left

// No HashMap
// ans = -1, count = -1