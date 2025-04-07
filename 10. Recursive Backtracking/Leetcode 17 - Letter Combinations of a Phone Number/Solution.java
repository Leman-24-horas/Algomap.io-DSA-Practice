import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        // edge case
        if(digits.length() == 0) {
            return new ArrayList<String>();
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        String sol = "";
        backTrack(digits, result, sol, map, 0);

        return result;
    }

    public void backTrack(String digits, List<String> result, String sol, Map<Character, String> map, int start) {
        if(start == digits.length()) {
            result.add(new String(sol));
            return;
        }

        // for(int i = start; i < digits.length(); i++) {
        String s = map.get(digits.charAt(start));
            for(int j = 0; j < s.length(); j++) {
                
                // skip the char
                // backTrack(digits, result, sol, map, start+1);
                // we don't need this since we loop through each character of the string

                // choose the char
                sol += s.charAt(j);
                backTrack(digits, result, sol, map, start+1);
                sol = sol.substring(0, sol.length() - 1);
            }
        // }
    }
}
