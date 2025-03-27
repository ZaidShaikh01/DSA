public class UniquePathsTwo {
//    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int dp [][] = new int[obstacleGrid.length][obstacleGrid[0].length];
////        for (int i =0;i<obstacleGrid.length;i++){
////            for (int j=0;j<obstacleGrid[0].length;j++){
////                dp[i][j]=-1;
////            }
////        }
//        return recursiveUniquePathsWithObstacles(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1,dp);
//    }
//    public static int recursiveUniquePathsWithObstacles(int [][] obstacleGrind, int m, int n,int [][]dp){
//
//        // Gonna extract the rows and columns
////        int m = obstacleGrind.length;
////        int n = obstacleGrind[m].length;
//        // The first base case is if it is at last position but in top bottom it is at first position
//
//
//        if (m == 0 && n ==0){
//            return 1;
//        }
//        // if m or n any of them is less than zero
//        if (m<0 || n<0){
//            return 0;
//        }
//        // Here we will check weather any obstacle is present if it is then we return 0
//        if (obstacleGrind[m][n] == 1){
//            return 0;
//        }
//        // checking if already exists in dp array
//        if (dp[m][n]!=0){
//            return dp[m][n];
//        }
//
//
//        // Now I have to check for top and bottom moment
//        int top=0;
//        int bottom=0;
//        if (m!=0){
//            top = recursiveUniquePathsWithObstacles(obstacleGrind,m-1,n,dp);
//        }
//        if(n!=0){
//            bottom = recursiveUniquePathsWithObstacles(obstacleGrind,m,n-1,dp);
//        }
//        return dp[m][n]=top + bottom;
//    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int dp [][] = new int[m][n];

        // if the first element in the row is obstacle
        if(obstacleGrid[0][0] == 1) return 0;
        // Here we are solving for base case that is each column and row will be one

        // We also need to see if any obstacle is present in the first row or first column
        for (int i=0;i<m;i++) {
            if (obstacleGrid[i][0]==1){
                break;
            }
            dp[i][0] = 1;
        }
        for (int j=0;j<n;j++) {
            if (obstacleGrid[0][j] ==1) break;
            dp[0][j] = 1;
        }
        // now we will start the iteration
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (obstacleGrid[i][j]!=1){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {

    }
}
