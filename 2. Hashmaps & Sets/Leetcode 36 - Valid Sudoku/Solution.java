import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Verify rows
        for(int i = 0; i < 9; i++) {
            Set<Character> s = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                char c = board[i][j];

                if(s.contains(c)) {
                    return false;
                } else if (c != '.') {
                    s.add(c);
                }
            }
        }

        // Verify cols
        for(int j = 0; j < 9; j++) {
            Set<Character> s = new HashSet<>();
            for(int i = 0; i < 9; i++) {
                char c = board[i][j];

                if(s.contains(c)) {
                    return false;
                } else if (c != '.') {
                    s.add(c);
                }
            }
        }

        // Verify boxes
        int[][] startingIndices = {{0,0}, {0,3}, {0,6},
                               {3,0}, {3,3}, {3,6},
                               {6, 0}, {6,3}, {6,6}};

        for(int[] idx : startingIndices) {
            Set<Character> s = new HashSet<>();
            for(int i = idx[0]; i < idx[0] + 3; i++) {
                for(int j = idx[1]; j < idx[1] + 3; j++) {
                    char c = board[i][j];

                    if(s.contains(c)) {
                        return false;
                    } else if (c != '.') {
                        s.add(c);
                    }
                }
            }        
        }
        return true;
    }
}