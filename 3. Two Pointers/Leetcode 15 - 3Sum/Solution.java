class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int l = i+1;
            int r = n-1;

            if(i != 0 && nums[i] == nums[i-1]) { // if offset repeats skip
                continue;
            }

            while(l < r && nums[i] <=0) {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    
                    ans.add(list);
                    
                    l++;
                    r--;

                    while(l < r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while(l < r && nums[r] == nums[r+1]) {
                        r--;
                    }

                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }
}

// 
// -10,-5,-5,-4,-4,-3,-2,-2,0,0,1,2,2,2,2,5,5