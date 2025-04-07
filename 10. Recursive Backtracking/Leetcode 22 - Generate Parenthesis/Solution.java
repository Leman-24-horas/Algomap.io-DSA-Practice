import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String sol = "";
        int open = 0;
        int close = 0;
        backTrack(n, result, sol, open, close);
        return result;
    }

    public void backTrack(int n, List<String> result, String sol, int open, int close) {
        if(sol.length() == 2*n) {
            // result.add(new String(sol)); don't need a new string
            result.add(sol);
            return;
        }

        if(open < n) {
            // sol += "(";
            // open += 1;
            backTrack(n, result, sol + "(", open + 1, close);
        }

        if(open > close) {
            // sol += ")";
            // close += 1;
            // open -= 1;
            // if you change these parameters individually the changes 
            // are persisted and go into the next recursion as well
            // that is why it is better to do + ")" and + 1  within the recursive call itself
            backTrack(n, result, sol + ")", open, close + 1);
        }

    }
}