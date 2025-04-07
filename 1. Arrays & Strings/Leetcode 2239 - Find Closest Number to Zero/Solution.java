class Solution {
    public int findClosestNumber(int[] nums) {
        int dist = Math.abs(0 - nums[0]);
        int numInQuestion = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int difference = Math.abs(0 - nums[i]);

            if (difference <= dist) {
                dist = difference;
                numInQuestion = nums[i];
                }
                
        }

        for(int i : nums) {
            if(Math.abs(numInQuestion) == i) {
                numInQuestion = i;
            }

        }

        return numInQuestion;
    }
}

// largest of the 2 numbers, doesn't mean to omit negative numbers all together
// Complexity is O(2n) = O(n)
