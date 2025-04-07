class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

        for(int i = 0; i < n; i++) {
            if(result.size() == 0 || result.get(result.size()-1)[1] < intervals[i][0]) {
                result.add(intervals[i]);
            } else {
                // result.get(-1) = {result.get(1)[0], Math.max(result.get(1)[1], intervals[i][1])};

                int[] current = result.get(result.size()-1);
                int[] intervalToBeSet = {current[0], Math.max(current[1], intervals[i][1])};
                result.set(result.size()-1, intervalToBeSet);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}

/* Need to sort the input
*  overlap: x[1] >= y[0]
*/

// java doesn't support negative indicies so alway do n-1 for last idx