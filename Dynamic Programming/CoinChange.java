public class CoinChange {

//    public static int coinChange(int[] coins, int amount) {
//        int [][] dp = new int[coins.length][amount+1];
//        for (int i=0;i< dp.length;i++){
//            for (int j=0;j<amount+1;j++){
//                dp[i][j]=-1;
//            }
//        }
//        int recurse = recursiveCoinChange(coins,coins.length-1,amount,dp);
//        return recurse != Integer.MAX_VALUE ? recurse : -1;
//    }
//
//    public static int recursiveCoinChange(int[] coins,int index,int amount,int[][]dp){
//
//
//        // If we are at first index & we still don't get any amount
//        if (index < 0){
//            return Integer.MAX_VALUE;
//        }
//        if (dp[index][amount]!=-1){
//            return dp[index][amount];
//        }
//        // When we have the amount
//        if (amount == 0){
//            return 0;
//        }
//
//
//
//        // Then we either take the amount or notTake it
//        int notTake = recursiveCoinChange(coins,index-1,amount,dp);
//        int take = Integer.MAX_VALUE;
//        if (amount >= coins[index]){
//
//            // We have to check weather the sub problem will give us the overflow
//
//            int sub = recursiveCoinChange(coins,index, amount-coins[index],dp);
//            if (sub!=Integer.MAX_VALUE)
//                take = 1+sub;
//        }
//
//
//        return dp[index][amount]=Math.min(take,notTake);
//
//    }

    // Tabulation
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int INF = (int)1e9;  // A big number, represents impossible
        int[][] dp = new int[n][amount + 1];

        // Base case: Fill first row (only using coins[0])
        for (int j = 0; j <= amount; j++) {
            if (j % coins[0] == 0)
                dp[0][j] = j / coins[0];
            else
                dp[0][j] = INF;
        }

        // DP fill
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                int notTake = dp[i - 1][j];  // don't use current coin
                int take = INF;
                if (j >= coins[i]) {
                    take = 1 + dp[i][j - coins[i]];  // use current coin
                }
                dp[i][j] = Math.min(take, notTake);
            }
        }

        int ans = dp[n - 1][amount];
        return ans >= INF ? -1 : ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5};
        System.out.println(coinChange(arr,11));

    }
}
