public class KnapSackUnbonded {

  //   Using memoization
  static int knapSack(int val[], int wt[], int capacity) {
      // code here

      // Initialize the DP array
      int [][]dp = new int[val.length+1][capacity+1];
      // Fill the array with -1
      for (int i=0;i< dp.length;i++){
          for (int j = 0; j< capacity+1;j++){
              dp[i][j]=-1;
          }
      }
      return recursiveUnboundedKnapsack(val,wt,capacity,val.length-1,dp);

  }
    public static int recursiveUnboundedKnapsack(int[] val, int[] wt, int capacity, int step, int [][] dp){

      if(step<0 || capacity ==0){
          return 0;
      }
      if (wt[step] > capacity){
          return recursiveUnboundedKnapsack(val,wt,capacity,step-1,dp);
      }
      if(dp[step][capacity] != -1){
          return dp[step][capacity];
      }

      // This is the only difference between bonded and unbonded knapsack
      int take = val[step]+recursiveUnboundedKnapsack(val,wt,capacity-wt[step],step,dp);
      int notTake = recursiveUnboundedKnapsack(val,wt,capacity,step-1,dp);

        return dp[step][capacity]=Math.max(take,notTake);
    }
    public static void main(String[] args) {

    }
}
