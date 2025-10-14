package Matrix_Questions;

public class Spriral_matrix_2 {

    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int i = 1;

        while(i <= n*n){
            for(int j=left; j<=right; j++){
                ans[top][j] = i++;
            }
            top++;

            for(int j=top; j<=bottom; j++){
                ans[j][right] = i++;
            }
            right--;

            for(int j=right; j>=left; j--){
                ans[bottom][j] = i++;
            }
            bottom--;

            for(int j=bottom; j>=top; j--){
                ans[j][left] = i++;
            }
            left++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generateMatrix(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
