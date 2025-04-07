// This type of question is for sliding windows of variable lengths

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxWindow = 0;
        int numZeros = 0;
        int n = nums.length;
        int l = 0;

        for(int r = 0; r < n; r++) {
            if(nums[r] == 0) {
                numZeros++;
            }

            while(numZeros > k) {
                if(nums[l] == 0) {
                    numZeros--;
                }
                l++;
            }

            int window = r-l+1;
            maxWindow = Math.max(maxWindow, window);
        }
        return maxWindow;
    }
}