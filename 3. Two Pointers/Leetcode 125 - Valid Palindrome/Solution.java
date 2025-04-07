class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        int l = 0;
        int r = n-1;

        while(l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);

            if(!Character.isLetterOrDigit(left)) {
                l++;
                continue;
            }

            if(!Character.isLetterOrDigit(right)) {
                r--;
                continue;
            }

            // Because of continue this part will only run when the strings are
            // alphanumeric
            if(Character.toLowerCase(left) != Character.toLowerCase(right)) { // time limit exceeded because s.toLowerCase is happening for the entire string twice, why not just do for char
                return false;
            }
            l++;
            r--;
        }
        return true; // 2ms, 99.09%
    }
}