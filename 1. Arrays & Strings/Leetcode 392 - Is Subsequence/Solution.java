class Solution {
    public boolean isSubsequence(String s, String t) {

        int idx = 0;
        int j = 0;

        // Base cases
        if(s == "") {
            return true;
        }

        for(int i = 0; i < s.length(); i++) {
        boolean matchFound = false;
            for(; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    matchFound = true;
                    idx = j;
                    break;
                }
            }

            j = idx + 1;

            if(matchFound == false) {
                return false;
            }
        }
        return true;
    }
}

// O(n^2) X
// O(t.length())
