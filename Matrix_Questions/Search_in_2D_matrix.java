package Matrix_Questions;

public class Search_in_2D_matrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1){
            if(matrix[0][0] == target){
                return true;
            }
        }
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);
    }
}
