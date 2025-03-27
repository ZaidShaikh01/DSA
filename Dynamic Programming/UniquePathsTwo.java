public class UniquePathsTwo {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp [][] = new int[obstacleGrid.length][obstacleGrid[0].length];
//        for (int i =0;i<obstacleGrid.length;i++){
//            for (int j=0;j<obstacleGrid[0].length;j++){
//                dp[i][j]=-1;
//            }
//        }
        return recursiveUniquePathsWithObstacles(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1,dp);
    }
    public static int recursiveUniquePathsWithObstacles(int [][] obstacleGrind, int m, int n,int [][]dp){

        // Gonna extract the rows and columns
//        int m = obstacleGrind.length;
//        int n = obstacleGrind[m].length;
        // The first base case is if it is at last position but in top bottom it is at first position


        if (m == 0 && n ==0){
            return 1;
        }
        // if m or n any of them is less than zero
        if (m<0 || n<0){
            return 0;
        }
        // Here we will check weather any obstacle is present if it is then we return 0
        if (obstacleGrind[m][n] == 1){
            return 0;
        }
        // checking if already exists in dp array
        if (dp[m][n]!=0){
            return dp[m][n];
        }


        // Now I have to check for top and bottom moment
        int top=0;
        int bottom=0;
        if (m!=0){
            top = recursiveUniquePathsWithObstacles(obstacleGrind,m-1,n,dp);
        }
        if(n!=0){
            bottom = recursiveUniquePathsWithObstacles(obstacleGrind,m,n-1,dp);
        }
        return dp[m][n]=top + bottom;
    }
    public static void main(String[] args) {

    }
}
