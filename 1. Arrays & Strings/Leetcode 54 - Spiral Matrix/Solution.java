class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < matrix[0].length; i++) {

        }

        int total  = matrix.length * matrix[0].length;
        int counter = 0;
       
        int i = 0; // horizontal idx
        int n = matrix[0].length;
        int j = 0; // vertical idx
        int m = matrix.length;

        int x = 0; // This is to show the limit because once you reach the end of a row/col you can't go to that index again.

        while (counter < total) {
            // go rightwards
            while (i < n - x) {
                int value = matrix[j][i];
                result.add(value);
                counter++;
                i++;
            }

            i = i - 1; // to decrease the effect of the last i++
            j = j + 1; // to prevent the last idx from being added again

            if (counter == total) break;

            // go down
            while(j < m - x) {
                int value = matrix[j][i];
                result.add(value);
                counter++;
                j++;
            }
            j = j - 1; // to decrease the effect of the last j++

            if (counter == total) break;

            // go leftwards
            while(i > 0 + x) {
                --i;
                int value = matrix[j][i];
                result.add(value);
                counter++;
            } // i = 0 here and j = m-1            

            x = x + 1;
            if (counter == total) break;

            // go up
            while(j > 0 + x) {
                --j;
                int value = matrix[j][i];
                result.add(value);
                counter++;
            }

            i = i + 1;
            if (counter == total) break;
        }
        return result;
    }
}

// horiztonal L to R
// vertical from Top to Bottom
// horizontal R to L

// horizontal L to R: [1][0] to [1][n-1 -1]

// O(m * n)