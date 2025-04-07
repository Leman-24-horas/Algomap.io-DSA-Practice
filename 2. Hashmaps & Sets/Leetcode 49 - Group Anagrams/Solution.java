import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            // String key = Arrays.toString(arr);
            String key = new String(arr); // 7ms, 66.32%

            if(!map.containsKey(key)) {
                List<String> anagrams = new ArrayList<>();
                map.put(key, anagrams);
            }

            map.get(key).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> l : map.values()) {
            result.add(l);
        }

        return result; //9ms, 35.2%
    }
}