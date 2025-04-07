class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;

        for(int r = 0; r < n; r++) {
            sum += nums[r];

            while(sum >= target) {
                int window = (r-l) + 1;
                minLen = Math.min(minLen, window);
                sum -= nums[l];
                l++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen; // 1ms, 99.80%
    }
}