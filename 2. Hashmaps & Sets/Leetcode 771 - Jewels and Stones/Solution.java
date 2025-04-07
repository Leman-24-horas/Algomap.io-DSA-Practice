import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> setOfJewels = new HashSet<>();
        for(char c : jewels.toCharArray()) {
            setOfJewels.add(c);
        }

        int counter = 0;
        for(char c : stones.toCharArray()) {
            if(setOfJewels.contains(c)) {
                counter++;
            }
        }

        return counter;
    }   // O(m + n)
}