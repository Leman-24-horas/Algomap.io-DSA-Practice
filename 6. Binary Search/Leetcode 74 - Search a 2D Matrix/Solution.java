class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length; // num_rows
        int n = matrix[0].length; // num_cols
        int l = 0;
        int r = m*n-1;

        while(l <= r) {
            int middle = l + (r-l)/2;
            int i = middle/n;
            int j = middle%n;

            if(matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                r = middle-1;// target is on the left half
            } else {
                l = middle+1; // it's always the same mistake m for middle
            }
        }
        
        return false; 
    }
}

/* i = row = middle/n
   j = col = middle%n
 */


