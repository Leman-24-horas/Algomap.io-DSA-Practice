class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = 0;
        int bigger = 0;

        if(word1.length() > bigger) {
            bigger = word1.length();
        } if (word2.length() > bigger) {
            bigger = word2.length();
        }

        while(i < bigger) {
            if(i < word1.length()) { 
                result += word1.charAt(i);
            } 
            
            if (i < word2.length()) { 
                result += word2.charAt(i);
            } 
            i++;
        }
        return result;
    }

    // Big-O is: O(n)
}