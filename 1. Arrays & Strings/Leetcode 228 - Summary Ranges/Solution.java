class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while(i < nums.length-1 && nums[i]+1 == nums[i+1]) {
                i++;
            }

            if(start != nums[i]) {
                result.add(Integer.toString(start) + "->" + Integer.toString(nums[i]));
            } else {
                result.add(Integer.toString(start));
            }

        }

        return result;
    }
}
// O(n) - i doesn't get reset 

// have a & b initialized to the same number
// move i and measure the gap
// if gap == 1, b = i, and i++