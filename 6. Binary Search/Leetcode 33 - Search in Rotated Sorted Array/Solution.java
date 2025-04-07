class Solution {
    public int search(int[] nums, int target) {
        // My inital approach
        // int n = nums.length;
        // int l = 0;
        // int r = n-1;

        // while(l <= r) {
        //     int m = (l+r)/2;
        //     if(nums[m] == target) {
        //         return m;
        //     } else {
        //         // Check which sorted subarray it is in
        //         if(nums[m] >= nums[l]) { // left sub array is sorted
        //             if(target >= nums[l] && target < nums[m]) { // target either in left
        //                 r = m-1;
        //             } else {
        //                 l = m+1; // target not in left
        //             }
        //         } else if (nums[m] <= nums[r]) { //right sub array is sorted
        //             if(target > nums[m] && target <= nums[r]) {
        //                 l = m+1; // target either in right
        //             } else {
        //                 r = m-1;
        //             }
        //         } 
        //     }
        // }
        // return -1; // 0ms, 100%


        // Ideal approach
        int n = nums.length;
        int l = -1; 
        int r = -1;
        int min = minIdx(nums);

        if(min == 0) {
            l = 0;
            r = n-1;
        } else if (target <= nums[min-1] && target >= nums[0]) {
            l = 0; 
            r = min-1;
        } else {
            l = min;
            r = n-1;
        }

        // normal binary search
        while(l <= r) {
            int m = (l+r)/2;
            if(nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m+1;
            } else {
                r = m-1;
            }
        } 

        return -1;
    }

    public static int minIdx(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while(l < r) {
            int m = (l+r)/2;

            if(nums[m] > nums[r]) {
                l = m+1;
            } else {
                r = m;
            }
        }

        return l;
    }
}

// 3 0 1 2
// L M   R