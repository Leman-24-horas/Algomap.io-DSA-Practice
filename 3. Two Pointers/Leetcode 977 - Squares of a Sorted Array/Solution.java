class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        int left = 0;
        int right = nums.length - 1;
        int j = nums.length - 1;
        int[] result = new int[nums.length];

        while(left <= right) {
            if(nums[left] < nums[right]) {
                result[j] = nums[right];
                right--;
            } else {
                result[j] = nums[left];
                left++;
            }

            j--;
        }

        return result; // 1ms, 100%
    }
    // whichever pointer has the biggest value shift that

}