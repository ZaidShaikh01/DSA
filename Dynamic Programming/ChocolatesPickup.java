public class ChocolatesPickup {

    public static int solve(int n, int m, int grid[][]) {
        // Code here

        int [][][] dp =new int[n][m][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                for (int k=0;k<m;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return recursvieChochlatesPickup(grid,0,0,n-1,dp);
    }
    public static int recursvieChochlatesPickup(int [][] grid,int row, int alice,int bob, int [][][] dp){
        // Out of bound case
        if (alice<0 || alice>=grid[0].length || bob<0 || bob>= grid[0].length){
            return (int) -1e8;
        }
        // We check if values exist already
        if (dp[row][alice][bob]!=-1){
            return dp[row][alice][bob];
        }
        // Destination case
        if (row == grid.length-1){
            // If we are both of them are standing at the same thing then we have to skip one
            if (alice==bob){
                return dp[row][alice][bob]=grid[grid.length-1][alice];
            }
            // If both are at different then we return the total of bob and alice chocolate
            else {
                return dp[row][alice][bob]=grid[grid.length-1][alice]+grid[grid.length-1][bob];
            }
        }

        int max = Integer.MIN_VALUE;
        // Now we have to explore every path

        // We are going to check left,right and down.. That is -1,0,1
        for (int aliceNext = -1; aliceNext <2; aliceNext++){
            for (int bobNext = -1; bobNext <2; bobNext++){
                if (alice == bob){
                    max=Math.max(max, grid[row][alice]+recursvieChochlatesPickup(grid,row+1,alice+aliceNext,bob+bobNext,dp));
                }
                else {
                    max=Math.max(max, grid[row][alice]+grid[row][bob]+recursvieChochlatesPickup(grid,row+1,alice+aliceNext,bob+bobNext,dp));
                }
            }
        }
        return dp[row][alice][bob]=max;
    }
    public static void main(String[] args) {

    }
}
