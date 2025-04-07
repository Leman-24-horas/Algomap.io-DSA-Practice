class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        Set<Character> set = new HashSet<>();
        int longest = 0;

        for(int r = 0; r < n; r++) {
            char c = s.charAt(r);

            while(set.contains(c)) {
                set.remove(s.charAt(l)); // remove from the left
                l++; // you are incrementing l until l=r see case 3
            }
            
            int window = (r-l) + 1;
            longest = Math.max(longest, window);
            set.add(c);

        }

        return longest; // 7ms, 37.61%, O(n)
    }

}
