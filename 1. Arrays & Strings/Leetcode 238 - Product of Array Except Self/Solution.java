class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int leftMul = 1;
        int rightMul = 1;

        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            int j = n-1 - i;

            leftArr[i] = leftMul;
            rightArr[j] = rightMul;
            leftMul *= nums[i];
            rightMul *= nums[j];

            j--;
        }

        for(int i = 0; i < n; i++) {
            result[i] = leftArr[i] * rightArr[i];
        }

        return result;
    }
}