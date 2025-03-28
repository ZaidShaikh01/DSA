public class MinimumPathSum {
    // Memoization
//    public static int minPathSum(int[][] grid) {
//        int dp [][] = new int[grid.length][grid[0].length];
//        for (int i =0;i<grid.length;i++){
//            for (int j=0;j<grid[0].length;j++){
//                dp[i][j]=-1;
//            }
//        }
//        return recursiveMinPathSum(grid, grid.length-1,grid[0].length-1, dp);
//    }
//    public static int recursiveMinPathSum(int [][] grid,int m ,int n, int[][]dp){
//        // This is similar to the unique path sum
//        // First base case when you reach destination
//        if(m==0 && n==0){
//            return grid[m][n];
//        }
//        // if one of them is less than zero we return 0
//        if (m<0 || n<0){
//            return Integer.MAX_VALUE;
//        }
//        // Now we calculate the value of top and left
//        // The formula is top = current + recursion
//        // for the base case we do
//        if(dp[m][n]!=-1){
//            return dp[m][n];
//        }
//        // We still need to include the elements of the first row so
//        if(m==0){
//            return grid[m][n] + recursiveMinPathSum(grid,m,n-1,dp);
//        }
//        if(n==0){
//            return grid[m][n] + recursiveMinPathSum(grid,m-1,n,dp);
//        }
//        int top = grid[m][n] + recursiveMinPathSum(grid,m-1,n,dp);
//
//
//        int left = grid[m][n] + recursiveMinPathSum(grid,m,n-1,dp);
//
//        return dp[m][n]=Math.min(left,top);
//    }
    // tabulation
    public static int minPathSum(int[][] grid) {
        int dp [][] = new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for (int i=0;i< grid.length;i++) dp[i][0]=grid[i][0];
        for (int j=0;j< grid[0].length;j++) dp[0][j]=grid[0][j];
        for (int i=1;i<grid.length;i++){
            for (int j=1;j<grid[0].length;j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {

    }
}
