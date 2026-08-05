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
                           boolean[] cols, boolean[] d1, boolean[] d2) {
        if (row == n) {
            List<String> sol = new ArrayList<>();
            for (char[] r : board)
                sol.add(new String(r));
            res.add(sol);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] || d1[row + col] || d2[col - row + n]) continue;
            board[row][col] = 'Q';
            cols[col] = d1[row + col] = d2[col - row + n] = true;
            backtrack(row + 1, n, board, res, cols, d1, d2);
            board[row][col] = '.';
            cols[col] = d1[row + col] = d2[col - row + n] = false;
        }
    }
}