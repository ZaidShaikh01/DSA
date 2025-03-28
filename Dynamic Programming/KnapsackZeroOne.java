import java.util.Arrays;

public class KnapsackZeroOne {
 // Using memoization
//    public static int knapsack(int W, int val[], int wt[]){
//        // Why to solve this question with dynamic programming 'Cuz this 0/1 knapsack problem where some subproblems are repeated
//
//        // Now transforming this into memoization
//
//        // WE need 2d array as the W is also important to determine which value is stored we don't want every weight to use the value stored
//        // Like W=2 can't use the value we stored for W=3.. Also as we have to increse or decrease the weight the W is one more
//        int [][] dp = new int[val.length][W+1];
//        // Initializing the 2D array
//        for (int i=0;i<val.length;i++){
//            for (int j=0;j<W+1;j++){
//                dp[i][j] = -1;
//            }
//        }
//        return recursiveKnapsack(W,val,wt,val.length-1,dp);
//
//    }
//    public static int recursiveKnapsack(int W,int val[],int wt[],int element,int [][]dp){
//
//        // This is the top bottom approach
//
//        // If the bag is full or there are no more elements
//        if(element<0 || W==0){
//            return 0;
//        }
//        // If the wt[element] is greater than the total weight then we have to move on to the next step
//        if (W<wt[element]){
//                return recursiveKnapsack(W,val,wt,element-1,dp);
//        }
//        // Now here we have to check weather the value already exists or not
//
//        if (dp[element][W]!=-1){
//            return dp[element][W];
//        }
//        // First we have to take the element
//        int takeElement = val[element]+recursiveKnapsack(W-wt[element],val,wt,element-1,dp);
//        // If we do not want to take the element
//        int notTake = recursiveKnapsack(W,val,wt,element-1,dp);
//
//        return dp[element][W]=Math.max(takeElement,notTake);
//    }

    // Using Tabulation

    // For tabulation I have to start from the base case then I have to build upon that
    // I guess I'll need a 2 dimensional array which will store the value.
    public static int knapsack(int W, int val[], int wt[]){
        int [][] dp = new int[val.length][W+1];
        for (int i=0;i<val.length;i++){
           for (int j=0;j<W+1;j++){
              dp[i][j] = -1;
            }
        }
        // This is the base case for knapsack & now I have to start filling it
        for (int i = 0; i <= val.length; i++) dp[i][0] = 0;  // First column
        for (int w = 0; w <= W; w++) dp[0][w] = 0;  // First row

        for (int i = 1;i<val.length;i++){
            for (int j =1;j<W+1;j++){
                // Filling the values with recurrence relation
                if(W<wt[j]){
                    dp[i][j] = dp[i-1][j];
                }
                dp[i][j] =Math.max(dp[i-j][j],val[i]+dp[i-1][j - wt[i]]);
            }
        }

        return (dp[val.length-1][W]);

    }



    public static void main(String[] args) {
        int weightOfBag= 4;
        int [] val ={1,2,3};
        int [] wt ={4,5,1};
        System.out.println(knapsack(weightOfBag,val,wt));
    }
}
