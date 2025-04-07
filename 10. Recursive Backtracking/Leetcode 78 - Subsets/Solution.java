import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        backTrack(0, nums, result, sol);

        return result;
    }

    public void backTrack(int root, int[] nums, List<List<Integer>> result, List<Integer> sol) {
        
        result.add(new ArrayList<>(sol)); // result is initially an empty list

        for(int i = root; i < nums.length; i++) {

            sol.add(nums[i]);
            backTrack(i+1, nums, result, sol);
            sol.remove(sol.size() - 1); // remove element from the end
        }

    }
}

/* Think of it as 
    Start with empty result list
    For every element you either include it in the sol
    Or you don't include it in the solution
 */