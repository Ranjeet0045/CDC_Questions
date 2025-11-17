package Backtracking;

public class N_Queens_2 {

    public static boolean isSafe(char[][] board,int row, int col, int n){
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q') return false;
        }
        
        for(int i=row,j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q') return false;
        }

        for(int i=row,j=col; i>=0 && j<n; i--,j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void solve(int row,char[][] board,int[] ans,int n){
        if(row == n){
            ans[0] += 1;
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                solve(row+1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }

    public static int totalNQueens(int n) {
        char[][] board = new char[n][n];
        int[] ans = new int[1];
        solve(0,board,ans,n);
        return ans[0];
    }

    public static void main(String[] args) {
        int n = 4;
        int ans = totalNQueens(n);
        System.out.println(ans);
    }
}
