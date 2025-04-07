class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int maxLeft = 0;
        int maxRight =  0;
        int[] maxLeftWall = new int[n];
        int[] maxRightWall = new int[n];

        for(int i = 0; i < n; i++) {

            // use fencepost here
            maxLeftWall[i] = maxLeft;
            maxRightWall[n-1-i] = maxRight;

            maxLeft = Math.max(maxLeft, height[i]); // setting maxLeft for i+1
            maxRight = Math.max(maxRight, height[n-1-i]);
        }

        int total = 0;
        for(int i = 0; i < n; i++) {
            int waterPotential = Math.min(maxLeftWall[i], maxRightWall[i]);
            int actualAmount = waterPotential - height[i];
            if(actualAmount >= 0) {
                total += actualAmount;
            }
        }
        
        return total;
    }
}