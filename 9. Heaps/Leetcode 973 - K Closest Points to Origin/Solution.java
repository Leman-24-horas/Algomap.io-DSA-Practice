class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
            int dist1 = a[0]*a[0] + a[1]*a[1];
            int dist2 = b[0]*b[0] + b[1]*b[1];
            return Integer.compare(dist2, dist1); // sort by max first
        });

        for(int[] i : points) {
            if(queue.size() < k) {
                queue.add(i);
            } else {
                queue.add(i); // add the smaller dist coord
                queue.poll(); // remove the larger ones
            }
        }

        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        
        return result;
    }
}