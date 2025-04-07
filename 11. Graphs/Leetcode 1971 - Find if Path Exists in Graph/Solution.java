import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) {
            return true;
        }

        Set<Integer> visited = new HashSet<>();
        visited.add(source);

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] connection : edges) {
            if(!map.containsKey(connection[0])) {
                map.put(connection[0], new ArrayList<>());
            } 
            map.get(connection[0]).add(connection[1]);

            // bidirectional so do both
            if(!map.containsKey(connection[1])) {
                map.put(connection[1], new ArrayList<>());
            } 
            map.get(connection[1]).add(connection[0]);
            
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while(!stack.empty()) {
            int currNode = stack.pop();

            if(currNode == destination) {
                return true;
            }

            if(map.containsKey(currNode)) {
                for(int neighbor : map.get(currNode)) {
                    
                    if(!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        stack.push(neighbor);
                    }
                }
            }
        }

        return false;
    }
}