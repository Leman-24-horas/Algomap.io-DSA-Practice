class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        int n = numbers.length;
        int l = 0;
        int r = n - 1;

        while(l <= r) {
            int sum = numbers[l] + numbers[r];
            
            if(sum == target) {
                result[0] = l + 1;
                result[1] = r + 1;
                return result;
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }
        return result; // 2ms, 92.65%
    }
}

/* find the  sum
    if the sum is too big move the left ptr
    if sum too small move the right ptr
 */

 // **non decreasing means there might be repeated numbers