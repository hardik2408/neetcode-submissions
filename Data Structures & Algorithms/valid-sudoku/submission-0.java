class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;

                int d = ch - '1';                 // 0..8
                int box = (i / 3) * 3 + (j / 3);  // 0..8
                if (rows[i][d] || cols[j][d] || boxes[box][d]) {
                    return false;
                }

                rows[i][d] = true;
                cols[j][d] = true;
                boxes[box][d] = true;
            }
        }

        return true;
    }
}