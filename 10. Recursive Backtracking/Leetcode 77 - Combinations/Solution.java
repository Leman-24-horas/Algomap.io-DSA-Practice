import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();

        backTrack(n, k, sol, result);
        return result;
    }

    public void backTrack(int n, int k, List<Integer> sol,List<List<Integer>> result) {

            // base case
            if(sol.size() == k) {
                result.add(new ArrayList<>(sol));
                return;
            }

            int numsLeft = n;
            int numsNeeded = k - sol.size();

            // if this is the case then you can skip choosing that number
            if(numsLeft > numsNeeded) {
                backTrack(n-1, k, sol, result);
                // move on to the next number
            }

            // when you have to choose the number
            sol.add(n);
            backTrack(n-1, k, sol, result);
            sol.remove(sol.size() - 1); 
        }
}

/* Start at n and work your way down
    at each level you have the choice of either picking the number or not picking it
 */