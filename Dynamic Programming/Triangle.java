import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class Triangle {

//    public static int minimumTotal(List<List<Integer>> triangle) {
//        // initializing the dp array
//        int [][] dp = new int[triangle.size()][triangle.size()];
//        for (int i=0;i<dp.length;i++){
//            for (int j=0;j<dp[0].length;j++){
//                dp[i][j]=-1;
//            }
//        }
//
//        // now we are going to return the value that we will get from recursive function
//        return recursiveMinimumTotal(triangle,0,0,dp);
//
//
//    }
//    public static int recursiveMinimumTotal(List<List<Integer>> triangle,int i, int j, int [][]dp){
//        // First base case is when we reach last element we return the value
//        if(i == triangle.size()-1){
//            return triangle.get(i).get(j);
//        }
//
//        // Memoization check
//        if (dp[i][j]!=-1){
//            return dp[i][j];
//        }
//
//        // Now there are two ways we can go
//        // We can either go right or bottom
//        int bottom = triangle.get(i).get(j) + recursiveMinimumTotal(triangle,i+1,j,dp);
//        int right = triangle.get(i).get(j) + recursiveMinimumTotal(triangle,i+1,j+1,dp);
//
//        // Now we gonna check the min value & return
//        return dp[i][j]=Math.min(bottom,right);
//
//    }
public static int minimumTotal(List<List<Integer>> triangle) {
    // initializing the dp array
    int [][] dp = new int[triangle.size()][triangle.size()];

    // Since we are doing it using bottom up apparoch we have to start from last row
    for (int i=0;i<triangle.get(triangle.size()-1).size();i++){
        dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
    }

    // Going from last second till i>0
    for (int i=triangle.size()-2;i>0;i--){
        for (int j=0; j<triangle.get(i).size();j++){
            dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i][j+1],dp[i+1][j+1]);
        }
    }
    // The answer is at top cuz we go from bottom to top
    return dp[0][0];

}

    public static void main(String[] args) {

        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        // Expected Output: 11 (2 → 3 → 5 → 1)
        System.out.println("Minimum Path Sum: " + minimumTotal(triangle));

    }
}
