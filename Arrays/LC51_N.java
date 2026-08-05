class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');
        backtrack(0, n, board, res, new boolean[n], new boolean[2*n], new boolean[2*n]);
        return res;
    }
    private void backtrack(int row, int n, char[][] board, List<List<String>> res,
                           boolean[] cols, boolean[] d0, boolean[] d1) {
        if (row == n) {
            List<String> sol = new ArrayList<>();
            for (char[] r : board)
                sol.add(new String(r));
            res.add(sol);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] || d0[row - col + n] || d1[row + col]) continue;
            board[row][col] = 'Q';
            cols[col] = d0[row - col + n] = d1[row + col] = true;
            backtrack(row + 1, n, board, res, cols, d0, d1);
            board[row][col] = '.';
            cols[col] = d0[row - col + n] = d1[row + col] = false;
        }
    }
}