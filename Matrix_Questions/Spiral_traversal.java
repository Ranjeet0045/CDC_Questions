package Matrix_Questions;

import java.util.ArrayList;
import java.util.List;

public class Spiral_traversal {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            // Right → Left (only if there's still a row left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom → Top (only if there's still a column left)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiralOrder(mat);
        System.out.println(ans);
    }
}
