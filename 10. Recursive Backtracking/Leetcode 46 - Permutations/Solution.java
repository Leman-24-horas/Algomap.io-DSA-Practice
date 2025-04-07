import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        boolean[] numUsed = new boolean[nums.length];

        backTrack(nums, result, sol, numUsed);
        return result;
    }

    public void backTrack(int[] nums, List<List<Integer>> result, List<Integer> sol, boolean[] numUsed) {

        // base case
        if(sol.size() == nums.length) {
            result.add(new ArrayList<>(sol));
            return;
        }

        // i = 0 because we need the loop to run the same no. of times each time
        for(int i = 0; i < nums.length; i++) {

            if(numUsed[i]) {
                continue; // if num has been used skip
            }

            sol.add(nums[i]);
            numUsed[i] = true;

            backTrack(nums, result, sol, numUsed);

            sol.remove(sol.size() - 1); // remove from the end
            numUsed[i] = false;

        }
    }
}