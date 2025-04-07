import java.util.*;

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : text.toCharArray()) {
            if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // What if a string has one of the char of balloon missing? return false
        Set<Character> keys = map.keySet(); // keySet() not need can just use map and containsKey()
        String balon = "balon";
        for(char c : balon.toCharArray()) {
            if(!keys.contains(c)) return 0;
        }

        int[] values = new int[5];
        int i = 0;
        for(Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getKey() == 'l' || e.getKey() == 'o') {
                values[i] = e.getValue()/2;
            } else {
                values[i] = e.getValue();
            }
            i++;
        }

        // alternate approach using values()
        // map.put('l', map.get('l')/2);
        // map.put('o', map.get('o')/2);
        // for(int v : map.values()) {
        //     values[i] = v;
        //     i++;
        // }

        Arrays.sort(values);
        return values[0];
    }
}

/* b : 1    / 1 = 1
*  a : 1    / 1 = 1
*  l : 2    / 2 = 1
*  o : 2    / 2 = 1
*  n : 1    / 1 = 1
* min of this 
*/

// My way = 13ms, beats 11.92%

// O(n)