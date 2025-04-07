class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = (int) shortestString(strs);
        // String result = "";
        int match = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j < strs.length; j++) {
                if(!(strs[0].charAt(i) == strs[j].charAt(i))) {
                    return strs[0].substring(0, i);
                }
            }
            // result += strs[0].charAt(i); // not very efficient because strings immutable
            match++;
        }
        return strs[0].substring(0, match); // this is a better way because your string (which is immutable) doesn't have to be copied and pasted over and over again as you add  new characters
    }

    public static double shortestString(String[] strs) {
        double smallestLength = Double.POSITIVE_INFINITY;

        for(String str : strs) {
            if(str.length() < smallestLength) {
                smallestLength = str.length();
            }
        }
        return smallestLength;
    }
}

// Find the string with the shortest length
// Then see how many of its characters match with the other strings
// Problem - 200 strings in the array, too much?

//  What happens if the first indices don't match
// What happens when you have a match up to index i and then it stops

// O(n * m): no. of strings x min length