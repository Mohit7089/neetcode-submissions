class Solution {
    public boolean safe(int row, int col, char[][] brd, int n) {
        int r = row;
        int c = col;
        while (row >= 0 && col >= 0) {
            if (brd[row][col] == 'Q')
                return false;
            row--;
            col--;
        }
        row = r;
        col = c;
        while (col >= 0) {
            if (brd[row][col] == 'Q')
                return false;
            col--;
        }
        row = r;
        col = c;
        while (row < n && col >= 0) {
            if (brd[row][col] == 'Q')
                return false;
            row++;
            col--;
        }
        return true;
    }

    public void solve(int col, List<List<String>> result, char[][] brd, int n) {
        if (col == n) {
            List<String> list = new ArrayList<>();
            for (char[] row : brd) {
                list.add(new String(row));
            }
            result.add(list);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (safe(row, col, brd, n)) {
                brd[row][col] = 'Q';
                solve(col + 1, result, brd, n);
                brd[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] brd = new char[n][n];
        for (int i = 0; i < brd.length; i++) {
            for (int j = 0; j < brd.length; j++) {
                brd[i][j] = '.';
            }
        }
        solve(0, result, brd, n);
        return result;

    }
}