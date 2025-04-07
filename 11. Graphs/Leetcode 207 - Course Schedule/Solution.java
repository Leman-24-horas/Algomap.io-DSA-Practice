class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] courses : prerequisites) {
            if(!graph.containsKey(courses[0])) {
                graph.put(courses[0], new ArrayList<>());
            }
            graph.get(courses[0]).add(courses[1]);
        }

        int status[] = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(!dfs(graph, status, i)) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(Map<Integer, List<Integer>> graph, int[] status, int i) {
        // in a cycle the node will not be fully visited so it will remain 1
        if (status[i] == 1) return false;
        if (status[i] == 2) return true;  // already visited

        status[i] = 1; // visitng curr node

        if (graph.containsKey(i)) {
            for (int neighbor : graph.get(i)) {
                if (!dfs(graph, status, neighbor)) {
                    return false;
                }
            }
        }

        status[i] = 2; // node has been visited
        return true;
    }
}