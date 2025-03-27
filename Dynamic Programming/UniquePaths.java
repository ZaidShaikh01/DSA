public class UniquePaths {
        // Memoization approach
//    public static int uniquePaths(int m, int n) {
//        int [][] dp = new int[m][n];
//        for (int i =0;i<m;i++){
//            for (int j=0;j<n;j++){
//                dp[i][j]=-1;
//            }
//        }
//        return recursiveUniquePaths(m-1,n-1,dp);
//    }
//
//    public static int recursiveUniquePaths(int m,int n,int [][]dp){
//        System.out.println("Column "+m +" Row: "+n);
//        // Here since I can only go bottom and right in the approach So, For this approach I have to do totally reverse.
//        // Cuz I'm doing top bottom approach
//
//        // First condition will be when the robot has reached
//        if (m == 0 && n == 0){
//
//            return 1;
//        }
//        // Second condition is when either the row or the column is less than 0, Then we have to return
//        if (m < 0 || n < 0){
//            return 0;
//        }
//        // Now we will go top and left, But for doing so we have to check first that can we go Top or can we go left..?
////        if(m == 0){
////            // Here we can not go at top
////        }
////        if(n == 0){
////            // Here we can not go to left
////        }
//        // Checking whether the element is already present or not
//        if (dp[m][n] != -1){
//            return dp[m][n];
//        }
//
//        int top = 0;
//        if(m != 0){
//            // Here we can go at top
//            top = recursiveUniquePaths(m-1,n,dp);
//
//        }
//        int left = 0;
//        if(n != 0){
//            // Here we can go to left
//            left = recursiveUniquePaths(m,n-1,dp);
//
//        }
//        return dp[m][n]=left + top;
//    }
    // Tabulation
        public static int uniquePaths(int m, int n) {
            int [][] dp = new int[m][n];

            for (int i = 0; i < m; i++) dp[i][0] = 1;
            for (int j = 0; j < n; j++) dp[0][j] = 1;

            for (int i = 1;i<m;i++){
                for (int j = 1;j<n;j++){
                    //System.out.println("Row: "+i+" Column "+j);
                    int bottom = dp[i-1][j];
                    int right = dp[i][j-1];
                    //System.out.println("Bottom "+bottom+" Right "+right);
                    dp[i][j]= right + bottom;
                    //System.out.println("Element at that position "+dp[i][j]);
                }
            }
            return dp[m-1][n-1];
        }



    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
