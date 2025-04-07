class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int[] arr = new int[26];
        int l = 0;
        int maxChar = 0;
        int longest = 0;

        for(int r = 0; r < n; r++) {
            arr[s.charAt(r) - 'A'] += 1;
            maxChar = Math.max(maxChar, arr[s.charAt(r) - 'A']);

            while((r-l+1) - maxChar > k) {
                arr[s.charAt(l) - 'A'] -= 1;
                l++;
            }

            int window = r-l+1;
            longest = Math.max(longest, window);
        }

        return longest; // 7ms, 92.63%
    }
}