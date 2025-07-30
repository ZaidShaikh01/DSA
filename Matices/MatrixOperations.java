import java.util.*;
class MatrixOperations{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int [] el : matrix){
            System.out.println(Arrays.toString(el));
        }
        System.out.println("Printing the arrays column wise: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" , ");
            }
            System.out.println();
        }
        System.out.println("Printing the Diagonals: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    System.out.print(matrix[i][j]+" , ");
                }
                else if(j == n - (i+1)){
                    System.out.print(matrix[i][j]+" , ");
                }
                else{
                    System.out.print(0+" , ");
                }
            }
            System.out.println();
        }
    }
}