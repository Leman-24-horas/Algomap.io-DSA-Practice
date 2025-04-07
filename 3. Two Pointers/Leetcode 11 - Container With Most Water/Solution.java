class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int maxWater = 0;
        int l = 0;
        int r = n-1;

        while(l < r) {
            int waterAmnt = (r-l) * Math.min(height[l], height[r]);
            maxWater = Math.max(maxWater, waterAmnt);

            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}