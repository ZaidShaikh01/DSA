public class MinimumFallingPathSum {
    //  Memoization apparoch
//    public static int  minFallingPathSum(int[][] matrix) {
//        // We also need to go throught the columns na so we have to ++ it too
//        // So, How  about we do it here
//
//        // Now we have to initialize dp array
//        int [][] dp = new int[matrix.length][matrix.length];
//        for (int i=0;i< dp.length;i++){
//            for (int j=0;j< dp.length;j++){
//                dp[i][j]=-1;
//            }
//        }
//        int min=Integer.MAX_VALUE;
//        for (int col=0;col<matrix.length;col++){
//            min = Math.min(min,recursiveMinFallingPath(matrix, matrix.length-1, col,dp));
//        }
//        return min;
//
//    }
//    public static int recursiveMinFallingPath(int [][] matrix,int row,int col,int [][] dp){
//        // If we go out of bound
//        if (col < 0 || col >= matrix.length){
//            return Integer.MAX_VALUE;
//        }
//        // We check if already exists or not
//        if (dp[row][col]!=-1){
//            return dp[row][col];
//        }
//        // if we at the 0th row
//        if (row == 0){
//            return dp[row][col]=matrix[row][col];
//        }
//
//
//
//        // Then we need to traverse & check which one is minimum
//        int left = recursiveMinFallingPath(matrix,row-1,col-1,dp);
//        int bottom = recursiveMinFallingPath(matrix,row-1,col,dp);
//        int right = recursiveMinFallingPath(matrix,row-1,col+1,dp);
//
//        return dp[row][col]=matrix[row][col]+Math.min(left, Math.min(bottom,right));
//    }

    // Tabuation apparoch
    public static int  minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        // We also need to go throught the columns na so we have to ++ it too
        // So, How  about we do it here

        // Now we have to initialize dp array
        int [][] dp = new int[n][n];

        // First the base case filling
        for (int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }

        // Filling rest of the table
        for (int i=1;i<n;i++){
            for (int j=0;j<n;j++){
                int up = dp[i-1][j];
                int left = j>0 ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int right = j < n-1 ? dp[i-1][j+1] : Integer.MAX_VALUE;

                dp[i][j]= matrix[i][j] + Math.min(up,Math.min(left,right));
            }
        }
        // Now the element will be store in the last element so
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] arr={{2,1,3},{6,5,4},{7,8,9}};

        System.out.println(minFallingPathSum(arr));
    }

}
