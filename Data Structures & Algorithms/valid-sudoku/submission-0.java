class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> charset = new HashSet<>();
        int x = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (!charset.add(board[i][j]))
                    return false;
            }
            charset.clear();
            for (int k = 0; k < 9; k++) {
                if (board[k][i] == '.')
                    continue;
                if (!charset.add(board[k][i]))
                    return false;
            }
            charset.clear();
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 3; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = x; l < x + 3; l++) {
                        if (board[k][l] == '.')
                            continue;
                        if (!charset.add(board[k][l]))
                            return false;
                    }
                }
                x += 3;
                charset.clear();
            }
            x = 0;
        }
        return true;
    }
}