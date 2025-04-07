class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

            for(int k = 0; k < n/2; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][n-k-1];
                matrix[i][n-k-1] = temp;
            }
        }
    }
}

/* Take the transpose
*  And flip vertically
*/

// temp = [0][0] = 1
// [0][0] = [0][0] = 1
// [0][0] = [0][0] = 1

// temp = [0][1] = 2
// [0][1] = [1][0] = 4
// [1][0] = 2