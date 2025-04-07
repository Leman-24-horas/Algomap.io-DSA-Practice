// This type of solution is for a sliding window of fixed length

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        for(int r = 0; r < k; r++) {
            sum += nums[r];
        }

        double maxAvg = sum/k;

        int n = nums.length;
        for(int r = k; r < n; r++) {
            sum -= nums[r-k];
            sum += nums[r];

            double currAvg = sum/k;
            maxAvg = Math.max(maxAvg, currAvg);
        }
        return maxAvg; // 5ms, 38.99%
    }
}