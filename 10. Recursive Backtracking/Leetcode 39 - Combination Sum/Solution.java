import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();

        backTrack(candidates, target, result, sol, 0, 0);
        return result;
    }

    public void backTrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> sol, int currSum, int i) {
        
        if(currSum == target) {
            result.add(new ArrayList<>(sol));
            return;
        }

        if(currSum > target || i >= candidates.length) {
            return;
        }

        // skip the current number
        backTrack(candidates, target, result, sol, currSum, i + 1);

        // pick the number
        currSum += candidates[i];
        sol.add(candidates[i]);
        backTrack(candidates, target, result, sol, currSum, i); // this is so that you can use that number again
        sol.remove(sol.size() - 1);
    }
}
