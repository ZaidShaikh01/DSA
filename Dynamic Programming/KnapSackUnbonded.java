public class KnapSackUnbonded {
  // Memoization
//  //   Using memoization
//  static int knapSack(int val[], int wt[], int capacity) {
//      // code here
//
//      // Initialize the DP array
//      int [][]dp = new int[val.length+1][capacity+1];
//      // Fill the array with -1
//      for (int i=0;i< dp.length;i++){
//          for (int j = 0; j< capacity+1;j++){
//              dp[i][j]=-1;
//          }
//      }
//      return recursiveUnboundedKnapsack(val,wt,capacity,val.length-1,dp);
//
//  }
//    public static int recursiveUnboundedKnapsack(int[] val, int[] wt, int capacity, int step, int [][] dp){
//
//      if(step<0 || capacity ==0){
//          return 0;
//      }
//      if (wt[step] > capacity){
//          return recursiveUnboundedKnapsack(val,wt,capacity,step-1,dp);
//      }
//      if(dp[step][capacity] != -1){
//          return dp[step][capacity];
//      }
//
//      // This is the only difference between bonded and unbonded knapsack
//      int take = val[step]+recursiveUnboundedKnapsack(val,wt,capacity-wt[step],step,dp);
//      int notTake = recursiveUnboundedKnapsack(val,wt,capacity,step-1,dp);
//
//        return dp[step][capacity]=Math.max(take,notTake);
//    }
  static int knapSack(int val[], int wt[], int capacity) {
      // code here

      // Initialize the DP array
      int [][]dp = new int[val.length][capacity+1];
      // Base Case: Fill first row (if the first item's weight is within the capacity)
      for (int j = 0; j <= capacity; j++) {
          if (wt[0] <= j) dp[0][j] = (j / wt[0]) * val[0];  // Take as many as we can
      }


      // Now there are base case where first row and coloumn is 0
      for (int i=0;i< val.length;i++) dp[i][0]=0;
      for (int i=0;i< capacity+1;i++) dp[0][i]=0;

      // Now we are going to loop from 1st row so,
      for (int i=1;i<val.length;i++){
          for (int j=1;j<capacity+1;j++){
              if(dp[i][j] != -1){
                  if(capacity<wt[j]){
                      dp[i][j] = dp[i-1][j];
                  }
                  dp[i][j]= Math.max(dp[i-1][j],val[i] + dp[i][j-wt[i]]);
              }
          }

      }
     return dp[val.length-1][capacity];
  }


    public static void main(String[] args) {

    }
}
