class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(backTrack(i, j, 0, board, word, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean backTrack(int i, int j, int currIdx, char[][] board, String word, boolean[][] visited) {
        
        // If you've successfully reached the last idx
        if(currIdx == word.length()) return true;

        // Cases in which to return false
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false; // idx out of bounds
        }

        if(board[i][j] != word.charAt(currIdx)) {
            return false; // If any idx doesn't match
        }

        if(visited[i][j]) {
            return false; // we have visited the board before
        }

        visited[i][j] = true; // we've visited that idx before
        
        boolean charFound = backTrack(i+1, j, currIdx+1, board, word, visited) || 
                            backTrack(i-1, j, currIdx+1, board, word, visited) || 
                            backTrack(i, j+1, currIdx+1, board, word, visited) || 
                            backTrack(i, j-1, currIdx+1, board, word, visited);

        visited[i][j] = false; // if the curr Idx is not of use then reset it

        return charFound;
    }
}

// for each box there are ideally 4 adj boxes to look in 