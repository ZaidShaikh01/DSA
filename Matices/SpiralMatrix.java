import java.util.*;
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return arr;
        int left = 0;
        int top =0;
        int right = matrix[0].length;
        int bottom = matrix.length;
        while(top<=bottom && left <=right){
            // Inserting the top elements
            for(int i = left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top>=bottom){
                for(int i = right;i>=left;i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(right>=left){
                for(int i = bottom;i>=top;i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
    public static void main(String [] args){

    }
}
