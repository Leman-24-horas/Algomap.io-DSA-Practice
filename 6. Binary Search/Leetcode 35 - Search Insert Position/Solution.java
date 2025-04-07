class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int m = -1;

        while(l <= r) {
            m = (l+r)/2;
            if(nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        } 

        // if(l > r) return l;
        // return r; 

        // alternative
        if(nums[m] < target) {
            return m+1;
        } 
        return m;
    }
}