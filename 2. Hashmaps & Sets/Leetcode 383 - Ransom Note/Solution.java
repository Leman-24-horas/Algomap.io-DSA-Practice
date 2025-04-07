import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) - 1); // put() > replace()
                if (map.get(c) == 0) map.remove(c); // remove(key) > remove(key, value) they both do the exact same thing
            } else {
                return false;
            }
        }

        return true; // O(m + n) 10ms, 60.44%
    }
}

// O(m + n)