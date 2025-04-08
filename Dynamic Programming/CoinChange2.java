public class CoinChange2 {
//    public static int change(int amount, int[] coins) {
//        int [][] dp = new int[coins.length][amount+1];
//        for (int i=0;i< dp.length;i++){
//            for (int j=0;j<amount+1;j++){
//                dp[i][j]=-1;
//            }
//        }
//
//        return recursiveChange(coins, coins.length - 1, amount, dp);
//    }
//
//    public static int recursiveChange(int [] coins,int index,int amount,int [][] dp){
//        if (amount == 0) return 1;      // Found one valid way
//        if (index < 0) return 0;        // No coins left to use, and amount still > 0
//        if (dp[index][amount]!=-1) return dp[index][amount];
//        // Now we have to recurse
//        int take=0;
//        int notTake= recursiveChange(coins,index-1,amount,dp);
//        if (coins[index] <= amount){
//            // Agar coin chota hai amount se to hi to lunga na mai target varna kya point hai?
//            take = recursiveChange(coins, index, amount-coins[index], dp);
//        }
//        return dp[index][amount]=take + notTake;
//    }
    public static int change(int amount, int[] coins) {
        int [][] dp = new int[coins.length][amount+1];
        for (int i=0;i< dp.length;i++){
            for (int j=0;j<amount+1;j++){
                dp[i][j]=-1;
            }
        }

        return recursiveChange(coins, coins.length - 1, amount, dp);
    }

    public static void main(String[] args) {

    }
}
