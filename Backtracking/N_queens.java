package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_queens {

    public static boolean isSafe(char[][] board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void solve(int row, char[][] board, List<List<String>> ans, int n) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            ans.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, ans, n);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        solve(0, board, ans, n);
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }
}
